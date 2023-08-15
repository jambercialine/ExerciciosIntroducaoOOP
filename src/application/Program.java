package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		Rectangle rectangle = new Rectangle ();
		
		double area, perimeter, diagonal;
		System.out.println("Enter rectangle width and height");
		System.out.print("widht: ");
		rectangle.width = sc.nextDouble();
		System.out.print("height: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println();
		
		area = rectangle.area();
		System.out.printf("Area: %.2f%n", area);
		perimeter = rectangle.perimeter();
		System.out.printf("Perimeter: %.2f%n",  perimeter);
		diagonal = rectangle.diagonal();
		System.out.printf("Diagonal: %.2f%n", diagonal);
		
		sc.close();
		
		
		
		

	}

}
