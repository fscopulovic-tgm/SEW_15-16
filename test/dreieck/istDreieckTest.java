/* Testet die Methode istDreick() von der Klasse Dreieck
 * @author Filip Scopulovic
 * @date 13.04.2016
 */
package dreieck;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class istDreieckTest {
	
	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;
	
	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}
	
	@Test
	public void istDreieckSeiteANull() {
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteBNUll() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(0);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteCNUll() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(4);
		dreieck.setSeite_c(0);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteAKleinerNull() {
		dreieck.setSeite_a(-1);
		dreieck.setSeite_b(4);
		dreieck.setSeite_c(6);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteBKleinerNull() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(-5);
		dreieck.setSeite_c(6);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteCKleinerNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(4);
		dreieck.setSeite_c(-7);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteAPlusSeiteBGleichSeiteC() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(6);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteAPlusSeiteCGleichSeiteB() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(6);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteBPlusSeiteCGleichSeiteA() {
		dreieck.setSeite_a(6);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteAPlusSeiteUnterNull() {
		dreieck.setSeite_a(Integer.MAX_VALUE);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteBPlusSeiteCUnterNull() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(Integer.MAX_VALUE-1);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteAPlusSeiteCUnterNull() {
		dreieck.setSeite_a(6);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(Integer.MAX_VALUE-1);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteAPlusSeiteBKleinerSeiteC() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(7);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteAPlusSeiteCKleinerSeiteB() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(7);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckSeiteBPlusSeiteCKleinerA() {
		dreieck.setSeite_a(7);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(2);
		
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void istDreieckTrue() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.istDreieck());
	}
}