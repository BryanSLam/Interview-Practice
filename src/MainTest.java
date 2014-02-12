import static org.junit.Assert.*;

import org.junit.Test;


public class MainTest {

	@Test
	public void testCharArrayReverse() {
		String s = "Hello World";
		String reverse = "dlroW olleH";
		StringBuilder sb = new StringBuilder();
		char[] test = s.toCharArray();
		
		test = Main.reverseCharArray(test);
		
		for(int i = 0; i< test.length; i++)
		{
			sb.append(test[i]);
		}
		assertEquals(reverse, sb.toString());
		
		test = Main.reverseCharArray(null);
		assertNull(test);
		
		char[] test2 = {'a'};
		test2 = Main.reverseCharArray(test2);
		char[] testResult2 = {'a'};
		assertArrayEquals(testResult2, test2);
		
		
	}
	
}
