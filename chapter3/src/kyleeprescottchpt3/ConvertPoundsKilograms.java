package kyleeprescottchpt3;
import java.util.Scanner;

public class ConvertPoundsKilograms {
/*
 * kylee prescott
 * 10/18
 */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// user input
	System.out.println("Enter the amount of pounds you want to convert to kilograms.");
    double pounds = input.nextDouble();
    double kilogram = .454;
    
    //calculations
    double convertedKilogram = (pounds* kilogram);
    
    //display output 
    System.out.println("There are "+convertedKilogram+" kilograms in "+pounds+" pounds");
    
    
    
	}
	

}
