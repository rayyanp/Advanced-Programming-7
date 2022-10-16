import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task2 {

	public static void main(String[] args) {

		try {
			Path textFile = Paths.get("./data/File4.txt");
			Path outputFile = Paths.get("./data/output.txt");

			
			InputStream is = Files.newInputStream(textFile);
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			BufferedWriter writer = Files.newBufferedWriter(outputFile);
			
			String line = "";
			while((line = reader.readLine()) != null) {
				System.out.println(line);
				if (line.startsWith("+")) {
				writer.write(line);
				writer.newLine();
				
				}	
			}
			writer.close();
		}

		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
