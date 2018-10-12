package kyleeprescottchpt3;
import java.util.Scanner;
public class ConvertCelciusToFarenheit {
/*
 * kylee prescott
 * 10/18
 */
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("enter the degrees in celcius");
		double celsius =input.nextDouble();
		double fahrenheit=(9.0/5)*celsius+32;
		

System.out.println(fahrenheit);

	}

}
