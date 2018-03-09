import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ChatCliente{

	private static Scanner scanner;

	public static void main(String[] args) {
		try {
			
			ChatIF chat = (ChatIF) Naming.lookup("rmi://localhost:1098/Chat"); //Buscando a Interface no Servidor
			
			//Iniciando as variaveis
			String nome;
			String msg = "";
			scanner = new Scanner(System.in);
			
			//Recebendo o nome do Usuario
			System.out.println("---------------------------------------------");
			System.out.println("	   SEJA BEM VINDO AO CHAT		         ");
			System.out.println("---------------------------------------------");
			System.out.print("[Chat] Digite seu nome: ");
			nome = scanner.nextLine();
			
			//Cria um novo cliente do tipo ChatIF
			ChatIF cliente = new Chat();
			cliente.setNome(nome);
									
			//Mensagem de boas vindas e menu inicial
			System.out.println("---------------------------------------------");
			System.out.println("Ola, " + cliente.getNome() + "! Voce agora esta conectado!");
			cliente.getMenu();
			
			//Adiciona o cliente a um arraylist no servidor
			chat.addClientes(cliente);
			
			//Envia uma mensagem inicial para todos do chat
			msg = "[Chat] "+cliente.getNome() + " entrou no Chat";
			chat.setMensagem(msg);
			
			//Envia as mensagens  para o servidor
			while(true){
				// Usuario fica lendo as mensagens
				// Para enviar msg precisa apertar [enter]
				while(msg.equals("")) {
					System.out.print("[Mensagem]: ");
					msg = scanner.nextLine();
					chat.setMensagem("["+cliente.getNome()+"]" + ": " + msg);
				}
				//Mostra o menu do chat
				if(msg.equals("/menu")) {
					cliente.getMenu();
				//Mostra todos os usuarios do chat
				}else if(msg.equals("/user")) {
					chat.getClientes(cliente);
				//entra em um chat privado
				}else if(msg.equals("/private")) {
					cliente.getMensagemPrivada(cliente, chat);
				}
				msg = scanner.nextLine(); //Aguarda a opcao do usuario
			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}
	}
}
