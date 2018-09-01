package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculadorateste {

	@Test
	void testSomar2_5() {

		Calculadora c = new Calculadora();
		int z = c.somar(2, 5);
		assertEquals(7, z);
	}

}
