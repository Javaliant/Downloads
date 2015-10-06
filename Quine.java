import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Quine {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String originalName = Quine.class.getSimpleName();
		String copyName = originalName + "Copy.java";

		PrintWriter writer = new PrintWriter(copyName, "UTF-8");
		Scanner input = new Scanner(new File("Quine.java"));

		while (input.hasNextLine()) {
			writer.println(input.nextLine().replace(originalName, originalName + "Copy"));
		}

		Runtime.getRuntime().exec("javac QuineCopy.java & java QuineCopy");

		writer.close();
	}
}
