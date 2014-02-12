import java.util.ArrayList;


public class MergeSort {
	public MergeSort(){
		
	}
	public ArrayList<Integer> mergeSort(ArrayList<Integer> a)
	{
		if(a.size() == 0 || a.size() == 1)
		{
			return a;
		}
		//Set the split point and create the subarrays
		int split = a.size()/2;
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
	
		for(int i = 0; i<split; i++)
		{
			left.add(a.get(i));
		}
		for(int i = split; i<a.size(); i++)
		{
			right.add(a.get(i));
		}
		//Recursive calls until you're left with single elements in arraylists
		left = mergeSort(left);
		right = mergeSort(right);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//Merge procedure
		//Pointers for left and right subarrays
		int leftPointer = 0;
		int rightPointer = 0;
		while(leftPointer!= left.size() && rightPointer != right.size())
		{
			if(left.get(leftPointer) <= right.get(rightPointer))
			{
				list.add(left.get(leftPointer));
				leftPointer++;
			}
			else
			{
				list.add(right.get(rightPointer));
				rightPointer++;
			}
		}
		//Spill over the rest if theres leftovers
		if(left.size() != leftPointer)
		{
			for(int i =leftPointer; i< left.size(); i++)
			{
				list.add(left.get(i));
			}
		}
		if(right.size() != rightPointer)
		{
			for(int i = rightPointer; i< right.size(); i++)
			{
				list.add(right.get(i));
			}
		}
		//Done
		return list;
	}
}
