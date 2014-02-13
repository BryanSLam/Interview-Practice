import java.util.ArrayList;
import java.util.Random;


public class QuickSort 
{
	public QuickSort()
	{
		
	}
	public ArrayList<Integer> quickSort(ArrayList<Integer> a)
	{
		//Algorithim is given a list, base case, pick a random pivot, create subarrays
		//place elements into subarrays based on comparison with pivot, recursivley call 
		//on subarrays while pivot is at its final point.  concatenate the recursive
		//calls with the pivot and the other subarray
		
		if (a.size() == 1 || a.size() == 0){
			return a;
		}
			
		else{
			ArrayList<Integer> left = new ArrayList<Integer>();
			ArrayList<Integer> right = new ArrayList<Integer>();
			Random r = new Random();
			
			//Random is inclusive of 0 and exclusive of the parameter
			int pivot = r.nextInt(a.size());
			
			for(int i = 0; i< a.size(); i++)
			{
				//As long as i isnt the same index as the pivot
				if(i != pivot){
					if(a.get(i)>a.get(pivot)){
						right.add(a.get(i));
					}
					else{
						left.add(a.get(i));
					}
				}
			}
			
			left = quickSort(left);
			right = quickSort(right);
			
			//Concatenate then return
			left.add(a.get(pivot));
			for(int i =0; i< right.size(); i++)
			{
				left.add(right.get(i));
			}
			
			return left;
		}
	}
	
}
