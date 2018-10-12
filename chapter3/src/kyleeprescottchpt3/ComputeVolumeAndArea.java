package kyleeprescottchpt3;
import java.util.Scanner;
public class ComputeVolumeAndArea {
	/*
	 * kylee prescott
	 * 10/18
	 */


	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// user input
		System.out.println(" Enter the radius of your cylinder ");
		double radius = input.nextDouble();
		System.out.println("Enter the length of your cylinder");  	
		double length = input.nextDouble();
		double PI = 3.1415926535979323846264338327950288419716939;
		// calculations
		
		double areaCylinder =(radius*radius*PI);
		double volumeCylinder = (areaCylinder*length);
		
		//display output 
		System.out.println("The area of your cylinder is "+areaCylinder+".");
		System.out.println("The volume of your cylinder is "+volumeCylinder+".");
		

	}

}
