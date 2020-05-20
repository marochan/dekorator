package Dekorator;

import java.awt.image.SampleModel;
import java.util.Vector;

public class DecoratorSparse extends Decorator implements Matrix {
	Matrix matrix;

	private int side1;
	private int side2;


	public DecoratorSparse(Matrix matrix, int side1, int side2) {
		super();
		this.matrix = matrix;
		this.side1 = side1;
		this.side2 = side2;
	}

	@Override
	public Vector<Element>[][] createMatrix(int side1, int side2) {

		super.createMatrix(side1, side2);
		fillSparse(sampleMatrix);
		return sampleMatrix;
	}
	
	@Override
	public void print() {

		for (Vector<Element>[] v : sampleMatrix) {
			System.out.print("|");
			for (Vector<Element> v2 : v) {
				System.out.print(" " + v2.get(0).value + " " + v2.get(1).value);
			}
			System.out.println(" |");
		}
	}
	public Vector<Dekorator.Element>[][] fillSparse(Vector<Element>[][] sampleMatrix) {
		for (int i = 0; i < sampleMatrix.length; i++) {
			for (int j = 0; j < sampleMatrix[i].length; j++) {
				
				if (i != j) {
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
