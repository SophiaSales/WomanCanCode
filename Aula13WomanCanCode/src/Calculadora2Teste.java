import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Calculadora2Teste {
	Calculadora2 calc2;
	
	@Before
	public void setUp() {
		calc2 = new Calculadora2();
	}

	@Test
	public void testeSoma() {
		calc2.setSoma(2,2);
		assertEquals(4,calc2.getSoma(),0);
	}
	@Test
	public void testeSubtracao() {
		calc2.setSubtracao(2,2);
		assertEquals(4,calc2.getSubtracao(),0);
	}
	@Test
	public void testeMultiplicacao() {
		calc2.setMultiplicacao(2,2);
		assertEquals(4,calc2.getMultiplicacao(),0);
	}
	@Test
	public void testeDivisao() {
		calc2.setDivisao(2,2);
		assertEquals(4,calc2.getDivisao(),0);
	}

}
