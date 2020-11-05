import static org.junit.Assert.*;

import org.junit.Test;
public class ParticipanteTest {
	Participante p1 = new Participante();

	@Test
	public void testSetNome() {
		p1.setNome("sophs");
		assertEquals("sophs", p1.getNome());
	}
    @Test
    public void testSetIdade() {
    	p1.setIdade(25);
    	assertEquals(39,p1.getIdade());
    }
}
