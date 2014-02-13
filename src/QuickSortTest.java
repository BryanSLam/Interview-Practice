import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.junit.Test;


public class QuickSortTest {
	//General
	@Test
	public void test1() {
		QuickSort qs = new QuickSort();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(12);
		a.add(3);
		a.add(5);
		a.add(4);
		a.add(0);
		a.add(-1);
		
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		sorted.add(-1);
		sorted.add(0);
		sorted.add(1);
		sorted.add(3);
		sorted.add(4);
		sorted.add(5);
		sorted.add(12);
		
		assertEquals(sorted, qs.quickSort(a));
		
	}
	//null case
	@Test
	public void test2(){
		QuickSort qs = new QuickSort();
		boolean flag = false;
		try{
			qs.quickSort(null);
		}
		catch(NullPointerException e){
			flag = true;
		}
		assertTrue(flag);
	}
	
	//Single element
	@Test 
	public void test3(){
		QuickSort qs = new QuickSort();
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(1);
		qs.quickSort(test);
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(1);
		assertEquals(test, answer);
	}
	
	//Already sorted
	@Test
	public void test4(){
		QuickSort qs = new QuickSort();
		ArrayList<Integer> test = new ArrayList<Integer>();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		test.add(1);
		test.add(2);
		test.add(3);
		
		answer.add(1);
		answer.add(2);
		answer.add(3);
		
		test = qs.quickSort(test);
		assertEquals(answer, test);
	}
	
	//Same Number
	@Test
	public void test5(){
		QuickSort qs = new QuickSort();
		ArrayList<Integer> test = new ArrayList<Integer>();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		test.add(1);
		test.add(1);
		test.add(1);
		test.add(1);
		test.add(1);
		
		answer.add(1);
		answer.add(1);
		answer.add(1);
		answer.add(1);
		answer.add(1);
		
		test = qs.quickSort(test);
		assertEquals(answer, test);
	}
	
	//Alot
	@Test
	public void test6(){
		Random r = new Random();
		QuickSort qs = new QuickSort();
		ArrayList<Integer> test = new ArrayList<Integer>();
		int[] answer = new int[1000000];
		int x = 0;
		for(int i=0; i<1000000; i++)
		{
			x = r.nextInt(1000000);
			test.add(x);
			answer[i] = x;
		}
		test = qs.quickSort(test);
		
		Arrays.sort(answer);
		ArrayList<Integer> answer1 = new ArrayList<Integer>();
		for(int i =0; i< answer.length; i++)
		{
			answer1.add(answer[i]);
		}
		
		assertEquals(test, answer1);
	}
	
}
