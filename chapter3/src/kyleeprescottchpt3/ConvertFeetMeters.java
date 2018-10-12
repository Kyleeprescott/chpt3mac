package kyleeprescottchpt3;
import java.util.Scanner;
public class ConvertFeetMeters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// user input 
		System.out.println("Enter the amount of feet you want to convert to meters.");
		double feet =input.nextDouble();
		double meters = .305;
       //calculations
		double convertedMeters = (feet*meters);
		//disply output
		System.out.println("There are "+convertedMeters+" meters in "+feet+" feet");
	}

}
