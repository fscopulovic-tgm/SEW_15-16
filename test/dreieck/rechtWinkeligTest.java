package dreieck;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class rechtWinkeligTest {

	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;
	
	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}
	
	@Test
	public void istDreieckRechtWinkeligTrueAgroesserBC() {
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(4);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.rechtWinkelig());
	}
	
	@Test
	public void istDreieckRechtWinkeligTrueBgroesserAC() {
		dreieck.setSeite_a(4);
		dreieck.setSeite_b(5);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.rechtWinkelig());
	}
	
	@Test
	public void istDreieckRechtWinkeligTrueCgroesserAB() {
		dreieck.setSeite_a(4);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(5);
		
		assertTrue(dreieck.rechtWinkelig());
	}
	
	@Test
	public void istDreieckRechtWinkeligFalseGleichSchenkelig() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	
	@Test
	public void istDreieckRechtWinkeligFalse() {
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	
	@Test
	public void istDreieckCgroesserB() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	
	@Test
	public void istDreieckRechtwinkeligTrue() {
		dreieck.setSeite_a(200000000);
		dreieck.setSeite_b(300000000);
		dreieck.setSeite_c(360555128);
		
		assertFalse(dreieck.rechtWinkelig());
	}
}
