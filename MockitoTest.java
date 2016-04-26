import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;
import static org.mockito.hamcrest.MockitoHamcrest.*;


import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MockitoTest {
	LinkedList<String> mockedList;
	
	@Before
	public void setUp() throws Exception {
		mockedList = mock(LinkedList.class);
	}

	@After
	public void tearDown() throws Exception {	
	}
	
	@Test
	public void testBehavior() {

		 //mock creation
		 List<String> mockedListt = mock(List.class);

		 //using mock object
		 mockedListt.add("one");
		 mockedListt.clear();
		 
		 //Man verifiziert das Verhalten von der gemockten LinkedList
		 //verification
		 verify(mockedListt).add("one");
		 verify(mockedListt).clear();
	}
	
}