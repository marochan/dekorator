package Dekorator;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Decorator deco = new Decorator();

	System.out.println("Which matrix would you like to generate?\n");
	System.out.println("1: DenseMatrix\n");
	System.out.println("2: SparseMatrix\n");
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	System.out.println("Choose length and width\n");
	int side1 = sc.nextInt();
	int side2 = sc.nextInt();
	switch (choice) {
	case 1:
		DecoratorDense dd = new DecoratorDense(deco,side1, side2);
		dd.createMatrix(side1, side2);
		dd.print();
		
		break;
	case 2:	
		DecoratorSparse ds = new DecoratorSparse(deco, side1, side2);
		ds.createMatrix(side1, side2);
		ds.print();
		break;
	}
	
	sc.close();
}
}