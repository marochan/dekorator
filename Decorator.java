package Dekorator;

import java.util.Vector;



public class Decorator implements Matrix {
	Matrix matrix;

	Vector<Dekorator.Element>[][] sampleMatrix = null;

	@Override
	public Vector<Dekorator.Element>[][] createMatrix(int side1, int side2) {
		this.sampleMatrix = new Vector[side1][side2];
		for (int i = 0; i < sampleMatrix.length; i++) {
			for (int j = 0; j < sampleMatrix[i].length; j++) {
				sampleMatrix[i][j] = new Vector<Element>();

			}
		}
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
	
	public Vector<Dekorator.Element>[][] fillDense() {
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
