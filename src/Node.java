import java.util.LinkedList;


public class Node {
	private int data;
	private LinkedList<Node> children;
	private boolean visited;
	public Node(int i)
	{
		children = new LinkedList<Node>();
		data = i;
		visited = false;
	}
	public void setData(int i)
	{
		data = i;
	}
	public int getData()
	{
		return data;
	}
	public LinkedList<Node> getChildren()
	{
		return children;
	}
	public void addChild(int i)
	{
		Node child = new Node(i);
		children.add(child);
	}
	public void visit()
	{
		visited = true;
	}
	public boolean getVisited()
	{
		return visited;
	}
}
