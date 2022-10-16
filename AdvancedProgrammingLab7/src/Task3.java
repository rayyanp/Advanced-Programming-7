import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task3 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://sandbox.kriswelsh.com/");
			URLConnection con = url.openConnection();
			Path outputFile2 = Paths.get("./data/outputFile2.txt");
			
			BufferedWriter writer = Files.newBufferedWriter(outputFile2);
			
			try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))){
				String line = "";
				while( (line = in.readLine()) != null) {
					System.out.println(line);
					writer.write(line);
					writer.newLine();
				}
				writer.close();
			}
			catch (IOException ioe) {
				throw ioe;
			}
		}
		
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
