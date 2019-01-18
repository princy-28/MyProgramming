package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainCalling {

  
  public static void main(String args[])
  {  
      long beforeusedmem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory(); 
      Runtime r = Runtime.getRuntime(); 
      System.out.println("Total memory is: " + beforeusedmem); 
       BinaryTree tree= new BinaryTree();
       AvlClass avl =new AvlClass();
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       Scanner sc=new Scanner(System.in);
       String ch, ch1, ch2;
       int n=0;
      
       do
       {
       System.out.println("******WELCOME********");
       System.out.println("Enter 1 for sorting");
       System.out.println("Enter 2 for Tree ");
       System.out.println("Please enter your choice");
     
       int choice=sc.nextInt();
       
       switch(choice)
       {
           case 1:{
                      do{  
                      System.out.println("Enter the length of array ");
                      System.out.println(" Length should be a numeric value");
                      String length=sc.next();
                      try{
                         n=Integer.parseInt(length);
                      }catch(Exception ex){
                      System.out.println("Invalid length");
                      System.out.println(ex.getMessage());
                   System. exit(0);          
                      }
                    // int n=sc.nextInt();
                        String arr1[]=new String[n]; 
                     int arr[]=new int[n];
                     System.out.println("Enter the values in array");
                    
                     for(int i=0;i<n;i++)
                     {
                     arr1[i]=sc.next();
                     }
                     
                     
                     for(int j=0;j<n;j++)
                     {
                          try 
                              { 
                                // checking valid integer using parseInt() method 
                                 arr[j]= Integer.parseInt(arr1[j]); 
                               }  
                         catch (NumberFormatException e)  
                       {   
                           System.out.println(arr1[j] + " at" + j+1+" position is not a valid integer number"); 
                           System.out.println("Please enter a valid integer");
                           arr1[j]=sc.next();
                           j--;
                         }            
                     }
                         
                  
                     
                     
                    System.out.println("********MENU***********");
                    System.out.println("Enter 1 for bubble sort");
                    System.out.println("Enter 2 for quick sort");
                    System.out.println("Enter 3 for Selection sort");
                    System.out.println("Enter 4 for MultiThread QuickSort");
                    System.out.println("Please enter your choice");
   
                    Bubble b1= new Bubble();
                    Selection ss= new Selection(); 
                    choice=sc.nextInt();
                    switch(choice)
                    {
                   case 1: b1.Bubble(arr, n);
                            break;
                       
                   case 2:Quick q=new Quick();
                         long starttime= System.nanoTime();
                         q.QuickSorting(arr,0, n-1);
                         System.out.println("\n \n Sorted array is : \n \n ");
                         for(int i=0;i<n;i++)
                         System.out.println(arr[i]+"  ");
                         long  endtime=System.nanoTime();
                         long timetaken=endtime-starttime;
                         System.out.print(" \n \n  Execution time in nano sec  :"+ timetaken);
                         System.out.print(" \n \n  Execution time in mili sec  :"+ timetaken/1000000);
                         break;
                  case 3: ss.SelectionSort(arr,n);
                         break;
                  case 4: String str=Thread.currentThread().getName();
                          Quicksort st=new Quicksort(arr,0,n-1);
                          st.start();
                          try {
                           Thread.sleep(500);
                            } catch (InterruptedException ex) {
                             System.out.println(ex.getMessage());
                              }
                   //      String threads[]=Quicksort.fullthread.split(" ");
                        
                         System.out.print("\n sorted array is");
        for( int k=0;k<n;k++)
        {
        System.out.print(st.arr[k]+" ");
        }
                                  
                          break;    
                      
                  default: System.out.println("Invalid choice");
                  }
                   System.out.println(" \n Do u want to continue(y/n) ");
                   System.out.println(" \n else any other charater ");
                   ch= sc.next();
                  }while( ch.equalsIgnoreCase("y"));
               
           }  
         break;
        case 2:{ 
                System.out.println(" Enter 1 for Binary Search Tree");
                System.out.println(" Enter 2 for AVL Tree");
                int chm=sc.nextInt();
                switch(chm)
                {
                    case 1:  
                             do{
                                 System.out.println("Enter a single digit ");
                                 System.out.println("Only the first digit will be consider in case of multiple Digit");
                                
                                char input = 0;
                                
                  /*  try {
                           try {
                               input = (char)br.read();
                           } catch (IOException ex) {
                               System.out.println( ex.getMessage());
                           } 
                                 
                    } catch (IOException ex) {
                       System.out.println(ex.getMessage());
                    }*/
                                 try
                                 {
                                 input=sc.next().charAt(0);
                                  n=(int) input;
                                 }
                                 catch(Exception ex)
                                 {
                                 System.out.println(ex.getMessage());
                                 }
                                 tree.Insertion(n);
                                 System.out.println(" \n press y  to continue ");
                                 System.out.println(" \n else any other charater ");
                                 ch= sc.next();
                              }while(ch.equalsIgnoreCase("y"));
                             do{
                            System.out.println("enter 1 for pre order travsal");
                            System.out.println("enter 2 for post order travsal");
                            System.out.println("enter 3 for in order travsal");
                            System.out.println("enter 4 for all order travsal at a glance");
                            System.out.println("enter 5 for deletion");
                          //  System.out.println("enter 6 for exit");

                            int chs=sc.nextInt();
                            switch(chs)
                            {
                                case 1: System.out.println(" travesal in  preorder");
                                        tree.preorder(); 
                                        break;
                                case 2: System.out.println("travesal in post order");
                                         tree.postorder();
                                        break;
                                case 3: System.out.println("travesal in in order ");
                                         tree.inorder();
                                         break;
                                case 4:System.out.println(" travesal in  inorder");
                                         tree.inorder();
                                       System.out.println(" travesal in  postorder");
                                         tree.postorder();    
                                       System.out.println(" travesal in  preorder");
                                         tree.preorder();        
                                      break;
                                case 5:System.out.println("enter a a value u want to delete");
                                       char inpt=sc.next().charAt(0);
                                       int d=(int)inpt;
                                       tree.delete(d);   
                                       System.out.print("\n \n travesal after deletion");
                                       System.out.print(" travesal in preorder \n");
                                       tree.preorder();
                                       System.out.print(" travesal in inorder \n");
                                       tree.inorder();
                                       System.out.print(" travesal in postorder \n ");
                                       tree.postorder();
                                    break;
                               // case 6: System.exit(0);
                                 //     break;
                                default : System.out.print("\n Please enter a valid choice");
                                           
                            }
                            System.out.println("\n Do u want to continue with this tree(y/n))");
                            System.out.println(" \n else any other charater ");
                            ch2=sc.next();
                             }while((ch2.equalsIgnoreCase("y")));
                        break;
                    case 2: AvlClass alv=new AvlClass();
                            do{
                                 System.out.println("Enter a single digit ");
                                 System.out.println("Only the first digit will be consider in case of multiple Digit");
                                 try{
                                 char input=sc.next().charAt(0);
                                 n=(int) input;
                                 }catch(Exception ex)
                                 {
                                 System.out.println(ex.getMessage());
                                 }
                                // int n=sc.nextInt();
                                 alv.Insert(n);
                                 System.out.println(" \n press y  to continue ");
                                 System.out.println(" \n else any other charater ");
                                 ch= sc.next();
                            }while(ch.equalsIgnoreCase("y"));
                            alv.Display(); 
                        break;
                    default: System.out.println(" Please enter a valid choice");    
                        
                        
                }
                break;
        }       
        default:System.out.println("Please enter a valid choice");
           
               
       }
       
       
       
             
      System.out.print("Do u want to continue with main program(press y to continue");
      System.out.println(" \n Else any other charater ");
       ch1=sc.next();
      
       }while ((ch1.equalsIgnoreCase("y")));
    
       long afterusedmem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
       long actualMemused= afterusedmem-beforeusedmem;
        System.out.println(" total memory used "+ actualMemused);
        long freeMemory = r.freeMemory();
        System.out.println("Free memory after collecting discarded Integers: " + freeMemory);
       
  } 
      
}
    
    

