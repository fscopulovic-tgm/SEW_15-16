/* Testet die Methode gleichSchenkelig() von der Klasse Dreieck
 * @author Filip Scopulovic
 * @date 13.04.2016
 */
package dreieck;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class gleichSchenkeligTest {

	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;
	
	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}
	
	@Test
	public void istDreieckGleichSchenkeligAFalse() {
		dreieck.setSeite_a(4);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void istDreieckGleichSchenkeligBFalse() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(4);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void istDreieckGleichSchenkeligCFalse() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(4);
		
		assertFalse(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void istDreieckGleichSchenkeligFalse() {
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void istDreieckGleichSchenkeligABTrue() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(5);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void istDreieckGleichSchenkeligACTrue() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(5);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void istDreieckGleichSchenkeligBCTrue() {
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
}
