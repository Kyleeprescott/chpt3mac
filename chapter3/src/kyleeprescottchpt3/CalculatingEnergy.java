package kyleeprescottchpt3;
import java.util.Scanner;
public class CalculatingEnergy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
          //user input 
		System.out.println(" Enter the amount of water in kilograms.");
		double weightKilograms = input.nextDouble();
		System.out.println("Enter the initial starting tempature in fahrenheit");
		double initialTempature = input.nextDouble();
		System.out.println(" Enter the final tempature in fahrenheit");
		double finalTempature = input.nextDouble();
		
		
		//calculations
		
		double celsius =(5.0/9)*(initialTempature-32);
		double celsiusnum2 =(5.0/9)*(finalTempature-32);
		//System.out.println(celsius);
		//System.out.println(celsiusnum2);
		double Joules = weightKilograms*(celsiusnum2-celsius)*4184;
		
		// display output
		System.out.println("The amount of energy needed was "+Joules+"");
	}

}
