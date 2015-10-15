/* Author: Luigi Vincent */

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Quine {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String originalName = Quine.class.getSimpleName();
		String copyName = originalName + "Copy";

		try (PrintWriter writer = new PrintWriter(copyName + ".java", "UTF-8");
			Scanner input = new Scanner(new File(originalName + ".java"))) {

			while (input.hasNextLine()) {
				writer.println(input.nextLine().replace(originalName, copyName));
			}
		}

		String compileCopy = "javac " + copyName + ".java";
		Runtime.getRuntime().exec(compileCopy);
	}
}
