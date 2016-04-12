/*
 * @author: Filip Scopulovic
 * @date: 08.04.2016
 * @use: StringTokenizer test cases
 */
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import org.junit.Test;

public class StringTokenizerTest {

	//Assign
	StringTokenizer st;
	
	public StringTokenizerTest() {
		st = new StringTokenizer("this is a test");
	}
	
	@Test
	public void outputTest() {	
		//Act
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
	
	@Test(expected = NoSuchElementException.class)
	public void noSuchElementTest() {
		//Act	
		while (st.hasMoreTokens()) {
			st.nextToken();
		}
		st.nextToken();
	}
}