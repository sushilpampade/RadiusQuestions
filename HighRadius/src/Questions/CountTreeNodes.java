package Questions;

public class CountTreeNodes {

 static class Node
 {
	 int data;
	 Node left,right;
	 public Node(int data)
	 {
		 this.left=null;
		 this.right=null;
		 this.data=data;
	 }
 }
	public int countNode(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		else
		{
			return 1+countNode(root.left)+countNode(root.right);
		}
		
	}
	
	
	
	public static void main(String[] args) {
     CountTreeNodes c=new CountTreeNodes();
     Node root=new Node(1);
     root.left=new Node(2);
     root.right=new Node(3);
     root.left.left=new Node(4);
     root.left.right=new Node(6);

     System.out.println("The total number of nodes= "+c.countNode(root));
	}

}
