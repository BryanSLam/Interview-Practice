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
//		for (int i=0; i<test.size(); i++)
//		{
//			System.out.println(test.get(i));
//		}
		
		System.out.println(binarySearch(test, 10));
		
	}
	//array must already be sorted
	public static boolean binarySearch(ArrayList<Integer> s, int x)
	{
		//For later
		ArrayList<Integer> sub = new ArrayList<Integer>();
		//corner cases
		if (s.size() == 0)
		{
			return false;
		}
		
		else
		{
			//If its equal to the middle then return true
			int middle = s.size()/2;
			if(s.get(middle) == x)
			{
				return true;
			}
			else
			{
				if(x<s.get(middle))
				{
					//up to not including middle
					for (int i =0; i<middle; i++)
					{
						sub.add(s.get(i));
					}
				}
				else
				{
					//everything after middle
					for (int i= middle+1; i<s.size(); i++)
					{
						sub.add(s.get(i));
					}
				}
				return binarySearch(sub, x);
			}
		}
		
	}

}
