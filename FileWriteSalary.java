import java.util.Scanner;
import java.io.*;

public class FileWriteSalary {
	public static void main (String[] args) throws FileNotFoundException {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many employees do you have? ");
		double employees = keyboard.nextDouble();
		keyboard.nextLine();
		double salary;
		
		System.out.print("Enter the filename: ");
		String filename = keyboard.nextLine();
		File f = new File(filename);
		if (f.exists()) {
			System.out.println("The file " + filename + " already exists.");
		} else {
		PrintWriter outputFile = new PrintWriter(filename);
		
		for (int i=1; i<=employees; i++) {
			System.out.printf("Enter the salary of employee number %d: $",i);
			salary = keyboard.nextDouble();
			outputFile.println("Salary of employee number " + i + ":\t$" + salary);
		}
		outputFile.close();
		System.out.println("Data written to file.");
		}
	}
}