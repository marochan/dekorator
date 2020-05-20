package Dekorator;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Decorator deco = new Decorator();
		DecoratorDense dd = new DecoratorDense(deco,4, 6);
		dd.createMatrix(4, 6);
		dd.print();
	}
	@org.junit.jupiter.api.Test
	void test2() {
		Decorator deco = new Decorator();
		DecoratorSparse ds = new DecoratorSparse(deco, 6, 7);
		ds.createMatrix(6, 7);
		ds.print();
	}
}
