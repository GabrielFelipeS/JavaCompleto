package IO;

import java.io.File;
import java.util.Scanner;

public class PathsFiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("FOLDERS:");
		File[] folders = path.listFiles(File::isDirectory);
		for(File file: folders) {
			System.out.println(file);
		}
		
		
		System.out.println("FILES:");
		File[] files = path.listFiles(File::isFile);
		for(File file: files) {
			System.out.println(file);
		}
		
		
		boolean sucess = new File(strPath + "//subdir").mkdir();
		System.out.println("Directory created sucessfuly: " + sucess);
		
		sc.close();
	}
}
