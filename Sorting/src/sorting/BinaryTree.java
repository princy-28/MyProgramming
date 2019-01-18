package sorting;

import java.util.Scanner;
public class BinaryTree
{
  class Node 
  {
    int key;
    Node left;
    Node right;
    
  Node(int item){
  key=item;
  left=right=null;
  
  }
  };
    
  Node root;
  
  public BinaryTree()
 {
 root=null;
 }
 public void Insertion( int key)
    { 
     this.root=Insert(root,key);
        
    }
 
 
 /* insertion without recursion 
 
 Node newNode(int data){
Node temp=new Node();
temp.key=data;
temp.left=null;
temp.right=null;
return temp;
} 
public void Insert( Node root,int val)
{
    Node nodenew= newNode(val);
    
    Node x=root;
    Node y=null;
while(x!=null)
{
 y=x;
if(val<x.key)
{
    x=x.left;
}
else
{
x=x.right;
}

}
// if y is equal to null it means root is null
// i.e. there is no element in tree
if(y==null)
{
y= nodenew;
root=y;
}
else if(y.key> val){
    y.left= nodenew;
  }
else
{
y.right=nodenew;
}
}
*/
 
 //insertion using recurion    
 
  
  public Node Insert(Node root, int val)
  {
      if(root==null)
  {
      root=new Node(val);
      return root;
 }
      if(val<root.key)
      {
      root.left=Insert(root.left, val);
      }
      else if(val>root.key)
      {
      root.right=Insert(root.right,val);
      }
  return root;
  } 
  

// if we don'nt want to create preorder method then
// we have to pass root as a parameter while calling preorderRec
 public  void preorder()
  {
  preorderRec(root);
  }
  void preorderRec(Node root)
    {
    if(root!= null)
    { char c=(char)root.key;
        System.out.println(c);
    preorderRec(root.left);
    preorderRec(root.right);
    }
    }
  
  // if we don'nt want to create preorder method then
// we have to pass root as a parameter while calling inorderRec
 public  void inorder()
  {
  inorderRec(root);
  }
  
  void inorderRec( Node root)
    {
        if(root !=null)
        {
            inorderRec(root.left);
             char c=(char)root.key;
            System.out.println(c);
            inorderRec(root.right);
        
        }
    }
  
   // if we don'nt want to create preorder method then
// we have to pass root as a parameter while calling postorderRec
 public void postorder()
  {
  postorderRec(root);
  }
    void postorderRec(Node root)
    {
    if(root!= null)
    {
    postorderRec(root.left);
    postorderRec(root.right);
    char c=(char)root.key;
    System.out.println(c);
    
    }
    }
    
 public void delete(int key)   
 {
 root=deletion(root,key);
 }
   
 
 Node deletion (Node root,int key)
 {
 if(root== null)
     return root;
 
 if(key<root.key)
     root.left=deletion(root.left,key);
 else if (key >root.key)
     root.right=deletion(root.right,key);
 else
 {
 if (root.left== null)
         return (root.right);
 else if(root.right==null)
 return root.left;
 
 root.key=newValue(root.right);
 root.right=deletion(root.right,root.key);
}
 return root;

}
 int newValue(Node root)
 {
 int midval=root.key;
 while(root.left!=null)
 {
 midval=root.left.key;
 root=root.left;
 }
 return midval;
 
 }
 
  public static void main(String args[])
  {
      BinaryTree tree= new BinaryTree();
       Scanner sc=new Scanner(System.in);
       String ch;
       do{
          
      System.out.println("enter a value");
      char input=sc.next(".").charAt(0);
      int n=(int) input;
      tree.Insertion(n);
       System.out.println(" \n press y  to continue ");
       System.out.println(" \n else any other charater ");
       ch= sc.next();
    
       }while(ch.equalsIgnoreCase("y"));
              
      System.out.println(" travesal in  inorder");
      tree.inorder();
      
   System.out.println(" travesal in  postorder");
      tree.postorder();    
    
      System.out.println(" travesal in  preorder");
      tree.preorder();    
       System.out.println("enter a a value u want to delete");
        char inpt=sc.next(".").charAt(0);
        int d=(int)inpt;
       tree.delete(d);
       
       System.out.print("\n \n travesal after deletion");
       System.out.print(" travesal in preorder \n");
       tree.preorder();
       System.out.print(" travesal in inorder \n");
       tree.inorder();
       System.out.print(" travesal in postorder \n ");
       tree.postorder();
       
  }  
}
    




    




