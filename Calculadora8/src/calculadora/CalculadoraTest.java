package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {


	@Test
	public void testE() {
		Calculadora c=new Calculadora(2,8);
		double respu=c.elevaXaN();
		double n=3;
		assertEquals(n, respu);
	}

}
