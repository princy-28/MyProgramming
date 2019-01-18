package sorting;
public class AvlClass
{

   private class Node
{
    int data;
    int height;
    Node left;
    Node right;
   
    public Node(int n)
    {
    left=null;
    right=null;
    data=n;
    height=1;
    }
}
   private Node root;
   
    
public void Insert (int num)
{
this.root=Insertion(this.root,num);
}

private Node Insertion(Node node, int item)
{
    if(node==null)
    { Node nn= new Node(item);
    return nn;
    }
    if(item>node.data)
      {
          node.right=Insertion(node.right,item);
    
    }else if(item<node.data)
    {
        node.left=Insertion(node.left,item);
    }
    
    node.height=Math.max(Height(node.left),Height(node.right)+1);
    
    
    int bf=BalanceFactor(node);
    
    //LeftRotation
    if(bf>1&&item<node.left.data)
    {
        return RightRotation(node);
    }
    // right rotation
    if(bf<-1&&item>node.right.data)
    {
    return LeftRotation(node);
    }
    //left right rotation
    if(bf>1&&item >node.left.data)
    {
    node.left=LeftRotation(node.left);
    return RightRotation(node);
    }
    //right left rotation
    if(bf<-1&&item <node.right.data)
    {
    node.right=LeftRotation(node.right);
    return LeftRotation(node);
    }
    return node;
    
}
private int Height(Node node)
{
if(node==null)
    return 0;

return node.height;
}
private int BalanceFactor(Node node)
{
if(node==null)
{
return 0;
}
return Height(node.left)-Height(node.right);
}
private Node RightRotation( Node c)
{ 
    Node b=c.left;
    Node t3=b.right;
    // rotation 
    b.right=c;
    c.left=t3;
// height update
    
    c.height=Math.max(Height(c.left),Height(c.right))+1;
    b.height=Math.max(Height(b.left),Height(b.right))+1;
    return b;
}
private Node LeftRotation( Node c)
{ 
    Node b=c.right;
    Node t2=b.left;
    // rotation 
    b.left=c;
    c.right=t2;
// height update
    
    c.height=Math.max(Height(c.left),Height(c.right)+1);
    b.height=Math.max(Height(b.left),Height(b.right)+1);
    return b;
}

public void Display()
{
    Display(this.root);
}
private void Display(Node node)
{
   
    if(node==null)
    {
    return;
    }
    
    String str=" ";
    if(node.left==null)
    {
    str=str+".";
    }else
    {
    str=str+(char)node.left.data+" ";
    } 
    str=str+" "+(char)node.data+" ";
    if(node.right==null)
    {
    str=str+".";
    }
    else
    {
    str=str+(char)node.right.data +" ";
    }
    
    System.out.println(str);
    Display(node.left);
    Display(node.right);
}
}