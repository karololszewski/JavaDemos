import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 
 * @author k.olszewski
 * Strona serwerowa przygotowuje informacje dla strony klienta(wpisujac cos w konsoli),
 * klient po napisaniu czegos dostanie informacje od serwera. 
 * Dziala w obie strony
 */
public class MyServer {

	public static void main(String[] args) throws Exception{
		try {
			ServerSocket ss = new ServerSocket(6666);  
			Socket s = ss.accept();//establishes connection   
			DataInputStream dis = new DataInputStream(s.getInputStream()); 
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String str = "";
			String str2 = "";
			while (!str.equals("stop")) {
				str = dis.readUTF();
				System.out.println("Client says: " + str);
				str2 = reader.readLine();
				dout.writeUTF(str2);
				dout.flush();
			}
			dis.close();
			s.close();
			ss.close();  
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
