/* Testet die Methode gleichSeitig() von der Klasse Dreieck
 * @author Filip Scopulovic
 * @date 13.04.2016
 */
package dreieck;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class gleichSeitigTest {

	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;
	
	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}
	
	@Test
	public void istDreieckGleichSeitigFalseA() {
		dreieck.setSeite_a(4);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
	@Test
	public void istDreieckGleichSeitigFalseB() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(4);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
	@Test
	public void istDreieckGleichSeitigFalseC() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(4);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
	@Test
	public void istDreieckGleichSeitigFalse() {
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(0);
		dreieck.setSeite_c(0);
		
		assertFalse(dreieck.gleichSeitig());
	}
	
	@Test
	public void istDreieckGleichSeitigTrue() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.gleichSeitig());
	}
}
