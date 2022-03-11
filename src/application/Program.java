package application;

import java.io.File;

public class Program {

	public static void main(String[] args) {
		
		File path = new File("c:\\temp");
		
		File[] folders = path.listFiles(File::isDirectory);
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File("c:\\temp\\newSubDir").mkdir();
		System.out.println("Create new subdirectory: " + success);
	}
}
