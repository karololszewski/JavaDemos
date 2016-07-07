import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClient {

	public static void main(String[] args) throws Exception {
		
		try {
			Socket s = new Socket("localhost", 6666);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			DataInputStream dis = new DataInputStream(s.getInputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String str = "";
			String str2 = "";
			while(!str.equals("stop")) {
				str = reader.readLine();
				dout.writeUTF(str);
				dout.flush();
				str2 = dis.readUTF();
				System.out.println("Server says: " + str2);
			}
			dout.close();
			s.close();
		} catch(Exception e) {
			System.err.println(e);
		}
		
	}

}
