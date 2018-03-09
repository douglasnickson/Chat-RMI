import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Scanner;

public class Chat extends UnicastRemoteObject implements ChatIF{

	private ArrayList<ChatIF> clientes;
	private String nome;
	private static Scanner scanner;

	protected Chat() throws RemoteException {
		super();
		this.clientes = new ArrayList<ChatIF>();
		scanner = new Scanner(System.in);
	}
	
	//Adiciona novos clientes no ArrayList
	@Override
	public void addClientes(ChatIF cliente) throws RemoteException {
		clientes.add(cliente);
	}
	
	//Define o nome dos clientes
	@Override
	public void setNome(String nome) throws RemoteException {
		this.nome = nome;
		
	}
	
	//Retorna o nome dos clientes
	@Override
	public String getNome() throws RemoteException {
		return this.nome;
		
	}	

	//Envia mensagens em broadcast para todos
	@Override
	public void setMensagem(String mensagem) throws RemoteException {
		for(ChatIF c : clientes) {
			c.getMensagem(mensagem);
		}
		
	}

	//Mostra as mensagem na tela para o cliente
	@Override
	public void getMensagem(String mensagem) throws RemoteException {
		System.out.println(mensagem);
	}
	
	//Mostra todos os clientes conectados
	@Override
	public void getClientes(ChatIF cliente) throws RemoteException {
		String clientList = "";	
		for (ChatIF c : clientes) {
            clientList += " " + c.getNome();
		}
		cliente.getMensagem(clientList);		
	}

	//Mostra o menu do chat
	@Override
	public void getMenu() throws RemoteException {
		System.out.println("---------------------------------------------");			
		System.out.println("(Enter)     : Enviar Mensagem");
		System.out.println("(/private)  : Enviar Mensagem Privada");
		System.out.println("(/user)     : Mostrar Usuarios");
		System.out.println("(/menu)     : Mostrar Menu");
		System.out.println("(/exit)     : Sair do Chat");
		System.out.println("---------------------------------------------");		
	}

	//Envia mensagens privadas ao cliente
	@Override
	public void setMensagemPrivada(String mensagem, String usuario) throws RemoteException {
		for(ChatIF c: clientes) {
			if(c.getNome().equals(usuario)) {
				c.getMensagem(mensagem);
				break;
			}
		}
	}

	//Gera um chat privado entre dois clientes
	@Override
	public void getMensagemPrivada(ChatIF cliente, ChatIF chat) throws RemoteException {
		String msg = "";
		System.out.println("---------------------------------------------");
		System.out.println("---------------- CHAT PRIVADO ---------------");			
		System.out.println("---------------------------------------------");
		System.out.println("(/exit): Sair do Privado");	
		System.out.println("---------------------------------------------");
		System.out.print("Digite o nome do Usuário: ");
		String p_user = scanner.nextLine();
		while(true){
			while(msg.equals("")) {
				System.out.print("[Mensagem Privada]: ");
				msg = scanner.nextLine();
				chat.setMensagemPrivada("["+cliente.getNome()+" Privado]" + ": " + msg, p_user);
			}
			msg = scanner.nextLine();
			if(msg.equals("/exit")) {
				System.out.println("---------------------------------------------");
				System.out.println("--------- VOLTANDO AO CHAT PUBLICO ----------");
				System.out.println("---------------------------------------------");
				return;
			}
		}
	}
}
