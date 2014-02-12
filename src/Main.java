import java.util.ArrayList;



public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(1);
		test.add(11);
		test.add(5);
		test.add(3);
		test.add(20);
		test.add(18);
		test.add(4);
		test.add(9);
		
		MergeSort ms = new MergeSort();
		QuickSort qs = new QuickSort();
		test= ms.mergeSort(test);
		for (int i=0; i<test.size(); i++)
		{
			System.out.println(test.get(i));
		}
	}

}
