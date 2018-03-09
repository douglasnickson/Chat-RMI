import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ChatServidor {

	public ChatServidor() {
		try {
			
			//Criando um novo registro
			Registry registry = LocateRegistry.createRegistry(1098);
			
			//Cria um novo servidor remoto
			ChatIF servidor = new Chat();
			
			//Registra a interface no registro de nome
			Naming.rebind("rmi://localhost:1098/Chat",servidor);
			
			System.out.println("Servidor Online");
			
		} catch (Exception e) {
			System.out.println("Erro ao Iniciar o Servidor: " + e);
		}
	}
	public static void main(String[] args) {
		new ChatServidor();
	}

}
