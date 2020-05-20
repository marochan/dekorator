package Dekorator;

import java.util.Vector;

import metoda.wytworcza.Element;

public class DecoratorDense extends Decorator implements Matrix {
	Matrix matrix;
	private int side1;
	private int side2;



	public DecoratorDense(Matrix matrix, int side1, int side2) {
		super();
		this.matrix = matrix;
		this.side1 = side1;
		this.side2 = side2;
	}

	
	public Vector<Dekorator.Element>[][] createMatrix(int side1, int side2) {

		super.createMatrix(side1, side2);
		fillDense(sampleMatrix);
		return sampleMatrix;
	}


	public void print() {

		for (Vector<Dekorator.Element>[] v : sampleMatrix) {
			System.out.print("|");
			for (Vector<Dekorator.Element> v2 : v) {
				System.out.print(" " + v2.get(0).value + " " + v2.get(1).value);
			}
			System.out.println(" |");
		}
	}
	public Vector<Dekorator.Element>[][] fillDense(Vector<Dekorator.Element>[][] sampleMatrix) {
		for (int i = 0; i < sampleMatrix.length; i++) {
			for (int j = 0; j < sampleMatrix[i].length; j++) {
				
				if (i == j) {
					sampleMatrix[i][j].add(new Dekorator.Element(0));
					sampleMatrix[i][j].add(new Dekorator.Element(0));
				} else {
					sampleMatrix[i][j].add(new Dekorator.Element(1));
					sampleMatrix[i][j].add(new Dekorator.Element(1));
				}

			}
		}
		return sampleMatrix;
	}
}
