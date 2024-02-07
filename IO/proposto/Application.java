package IO.proposto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String file = scan.nextLine();
		
		String outputPath = new File(file).getParent();
		
		boolean sucess = new File(outputPath + "/out").mkdir();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file));
			BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath + "/out/summary.csv", true))) {
			String line;
			while((line = br.readLine()) != null) {
				String[] columns = line.split(",");
				String nome = columns[0];
				double price = Double.parseDouble(columns[1]);
				Integer quantity = Integer.parseInt(columns[2]);

				bw.write(nome + "," + price * quantity);
				bw.newLine();
			}
			System.err.println("Sucess");
		} catch(IOException e) {
			e.getStackTrace();
		}
		
		
		scan.close();
	}
}
