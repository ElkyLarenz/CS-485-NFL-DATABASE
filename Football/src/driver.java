import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class driver {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//teams temp = new teams();
		
		URL url = new URL("https://www.nfl.com/standings");
		
		URLConnection con = url.openConnection();
		InputStream is = con.getInputStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		String line = null;
		
		while((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
	}

}
