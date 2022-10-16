import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task1 {

	public static void main(String[] args) {

		try {
			Path input = Paths.get("./data/");
			DirectoryStream<Path> ds = Files.newDirectoryStream(input);
			
			for (Path p: ds) {
				if (p.toString().endsWith(".txt")) {
					Files.copy(p,  Paths.get("./output/" + p.getFileName()));
				}
				
			}
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
