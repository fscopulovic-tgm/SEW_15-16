/*
 * @author: Filip Scopulovic
 * @date: 08.04.2016
 * @use: StringTokenizer test cases
 */
import static org.junit.Assert.assertEquals;

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
	
	@Test
	public void countTokensTest() {
		//Assert
		assertEquals("CountToken should return the number 4",4,st.countTokens());
	}
	
	@Test
	public void specialCharacterTest() {
		//Assign
		StringTokenizer hilfe = new StringTokenizer("this-is-a-test");
		int i = 0;
		
		//Act
		while(hilfe.hasMoreTokens()) {
			System.out.println(hilfe.nextToken());
			i++;
		}
		
		System.out.print("Number of tokens in hilfe: "+i+"\n As we see now StringTokenizer does not seperate by '-', it only seperates by space");
	}
	
	@Test
	public void lineFeedTest() {
		//Assign
		StringTokenizer hilfe = new StringTokenizer("this\nis\na\ntest");
		
		//Assert
		assertEquals("this",hilfe.nextToken());
		assertEquals("is",hilfe.nextToken());
		assertEquals("a",hilfe.nextToken());
		assertEquals("test",hilfe.nextToken());
	}
}