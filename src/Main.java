import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;



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
		
//		System.out.println(remove("google", 'o'));
//		int[] array = new int[5];
		
		String s = "racecar";
		char[] test2 = s.toCharArray();
		test2 = reverseCharArray(test2);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<test2.length; i++)
		{
			sb.append(test2[i]);
		}
		System.out.println(sb.toString());
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
	//Given a string and a char remove instances of the char in
	//the string don't use replace
	public static String remove(String s, char c)
	{
		//Quick corner case maybe not needed
		if(s.length() == 0)
		{
			return s;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i< s.length(); i++)
		{
			if (s.charAt(i)!= c)
			{
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
		
	}
	//Write the recursive implementation of DFS and BFS for an n-ary tree. 
	//Tree node has an int data item, and a linked list "children" of nodes.
	public static boolean DFS(Node root, int lookup)
	{
		if(root.getData() == lookup)
		{
			return true;
		}
		//DFS Uses a stack
		Stack<Node> stack = new Stack<Node>();
		//add root to stack
		stack.add(root);		
		//Begin da while loop
		boolean found = false;
		
		//Logic: pop a node off the stack, recursive call, if it return true
		//then return true, else add its children to a stack if the child 
		//hasn't been visited yet
		//if you find nothing and you're at a leaf, return false
		while(stack.empty() == false)
		{
			Node currentNode = stack.pop();
			//Recursive call to check current node
			found = DFS(currentNode, lookup);
			if (found == true)
			{
				return true;
			}
			Iterator<Node> iterator = root.getChildren().iterator();
			while(iterator.hasNext() == true)
			{
				Node nextNode = iterator.next();
				if(nextNode.getVisited() == false)
				{
					stack.add(nextNode);
				}
			}
		}
		//found nothing
		return false;
	}
	
	//Write a program to reverse a character array "Hello World". 
	//Give different test cases(input arrays) to test your code.
	
	public static char[] reverseCharArray(char[] a)
	{
		char[] reverse = new char[a.length];
		int counter = 0;
		for(int i=a.length-1; i>=0; i--)
		{
			reverse[counter] = a[i];
			counter++;
		}
		return reverse;
	}
	

}
