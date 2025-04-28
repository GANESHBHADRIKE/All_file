package learning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File obj = new File("C:\\Users\\Ganesh Bhadrike\\OneDrive\\Desktop\\eclipse-workspace\\JavaBasic\\src\\learning\\Ganesh.txt");
		Scanner scn = new Scanner(obj);
		while(scn.hasNextLine()) {
			String data = scn.nextLine();
			System.out.println(data);
		}
		
	}

}
