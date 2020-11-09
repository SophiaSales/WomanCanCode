import static org.junit.Assert.*;
import org.junit.Test;
public class CalculadoraTest {

	private static final double DELTA = 0.000001;

	
	@Test
	private void testSomaDeveRetornarDQuandoPassamosZeroEZero(){ 
		double n1 = 0;		
		double n2 = 0;
		
		Calculadora aut = new Calculadora(n1,n2);
		
		double valorObtido = aut.getSoma();
		double valorEsperado = 0;
		
		assertEquals(valorEsperado,valorObtido, DELTA);
	}
    @Test
    public void testDivisao() {
    	double n1 = 10;
    	double n2 = 2;
    	
    	Calculadora aut = new Calculadora(n1,n2);
    	
    	double valorObtido = aut.getDivisao();
    	double valorEsperado = 5;
    	
    	assertEquals(valorEsperado,valorObtido, DELTA);
    }
}
