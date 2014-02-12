import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Random;

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
		
		boolean flag = false;
		try{
			Main.reverseCharArray(null);
		}
		catch(NullPointerException exception)
		{
			flag=true;
		}
		assertTrue(flag);
		
		char[] test2 = {'a'};
		test2 = Main.reverseCharArray(test2);
		char[] testResult2 = {'a'};
		assertArrayEquals(testResult2, test2);
		
		char[] testResult3 = {'a','a','a','a','a'};
		char[] test3 = Main.reverseCharArray(testResult3);
		assertArrayEquals(test3, testResult3);
		
		char[] test4 = {};
		char[] testResult4 = {};
		test4 = Main.reverseCharArray(test4);
		assertArrayEquals(test4, testResult4);
		
		//Test with max space
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random random = new Random();
		StringBuilder sb1 = new StringBuilder();
		char[] test5 = new char[1000000];
		for(int i=0; i< test5.length; i++)
		{
			//the parameter alphabet.length is exclusive so it'll pick a random number
			//from 0 -> alphabet.length-1
			test5[i] = alphabet.charAt(random.nextInt(alphabet.length()));
			sb1.append(test5[i]);
		}
		
		test5 = Main.reverseCharArray(test5);
		assertArrayEquals(test5, sb1.reverse().toString().toCharArray());
		//Support UTF8 vs ascii?
		
	}
	
}
