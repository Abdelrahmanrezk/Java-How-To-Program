
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDierctoryInfo{

	public static void main(String [] args) throws IOException{

		Scanner input = new Scanner(System.in);
		System.out.println("Enter File or Directory name:");

		// Create a path object based on user input
		Path path = Paths.get(input.nextLine());

		if(Files.exists(path)) // if path exists, out some info
		{
			// display file or directory information
			System.out.printf("%n%s exists%n", path.getFileName());

			System.out.printf("%s a directory%n",
				Files.isDirectory(path) ? "Is": "IS NOt");

			System.out.printf("%s an absolute path%n",
				path.isAbsolute() ? "Is" : "Is not");

			 System.out.printf("Last modified: %s%n", 
			 	Files.getLastModifiedTime(path));

			System.out.printf("Size: %s%n", Files.size(path));

			System.out.printf("Path: %s%n", path);

			System.out.printf("Absolute path: %s%n", path.toAbsolutePath());
			
			if(Files.isDirectory(path)) // output dierctory listing
			{
				System.out.printf("%nDierctory contents: %n");
				DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
				for(Path p: directoryStream)
					System.out.println(p);
				
			}
		}else {
			System.out.printf("%s does not exist%n", path);
		}

	} // end of main method

}// end of FileAndDierctoryInfo class