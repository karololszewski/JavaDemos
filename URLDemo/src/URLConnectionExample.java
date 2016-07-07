import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionExample {

	public static void main(String[] args) {

		try {
			
			URL url = new URL("http://www.javatpoint.com/java-tutorial");
			URLConnection urlConn = url.openConnection();
			InputStream stream = urlConn.getInputStream();
			int i;
			
			while((i=stream.read()) != -1) {
				
				System.out.print((char)i);
				
			}
			
		} catch(Exception e) {
			
			System.err.println(e);
			
		}
		
	}

}
