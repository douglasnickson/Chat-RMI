import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ChatIF extends Remote{

	public void addClientes (ChatIF cliente) throws RemoteException;
	public void getClientes(ChatIF cliente) throws RemoteException;
	public void setNome(String nome) throws RemoteException;
	public String getNome() throws RemoteException;
	public void setMensagem (String mensagem) throws RemoteException;
	public void getMensagem (String mensagem) throws RemoteException;
	public void setMensagemPrivada (String mensagem, String usuario) throws RemoteException;
	public void getMensagemPrivada (ChatIF cliente, ChatIF chat) throws RemoteException;
	public void getMenu() throws RemoteException;
	
}
