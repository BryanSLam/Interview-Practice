import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;


public class QuickSortTest {

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

	public void test2(){
		QuickSort qs = new QuickSort();
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		ArrayList<Integer> sorted = new ArrayList<Integer>();
	}
}
