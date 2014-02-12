import java.util.ArrayList;
import java.util.Random;


public class QuickSort 
{
	public QuickSort()
	{
		
	}
	public ArrayList<Integer> quickSort(ArrayList<Integer> a)
	{
		//Base case
		if (a.size() == 0 || a.size() == 1)
		{
			return a;
		}
		//Else prepare the two subarrays
		ArrayList<Integer> less = new ArrayList<Integer>();
		ArrayList<Integer> greater = new ArrayList<Integer>();
		
		//generate random pivot random is inclusive so size-1
		Random r = new Random();
		int pivot = r.nextInt(a.size()-1);
		
		//Partition into left and right subarrays
		for (int i = 0; i<a.size(); i++)
		{
			if (i != pivot)
			{
				if(a.get(i) <= a.get(pivot))
				{
					less.add(a.get(i));
				}
				else
				{
					greater.add(a.get(i));
				}
			}
		}
		//Recursive quicksort
		less = quickSort(less);
		greater = quickSort(greater);
		//concatenate
		less.add(a.get(pivot));
		for (int i = 0; i<greater.size(); i++)
		{
			less.add(greater.get(i));
		}
		return less;
	}
	
}
