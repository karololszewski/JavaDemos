
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionDemo {

	public static void main(String[] args) {
		
		try {
			
			URL url = new URL("http://www.javatpoint.com/java-tutorial");
			HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
			
			for(int i = 1; i <= 8; i++) {
				System.out.println(httpConn.getHeaderFieldKey(i) + " = " + httpConn.getHeaderField(i));
			}
			
			httpConn.disconnect();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		

	}

}
