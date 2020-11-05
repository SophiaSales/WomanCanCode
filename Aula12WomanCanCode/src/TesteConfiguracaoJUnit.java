import org.junit.Assert;

import org.junit.Test;

public class TesteConfiguracaoJUnit {

	@Test
	public void testConfiguraçao() {
		Assert.assertEquals(2,(1+1),0);
	}
    @Test
    public void testeConfiguracaoNegativo() {
    	Assert.assertEquals(2,(2+1),0);
    }
}
