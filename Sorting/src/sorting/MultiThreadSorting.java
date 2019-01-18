package sorting;

import java.util.Scanner;

public class MultiThreadSorting {
    
    public static void main(String args[])
    { 
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the length of array ");
                      System.out.println(" Length should be a numeric value");
                     int n=sc.nextInt();
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
                           System.out.println(arr1[j] +"at"+ j+1 +" position is not a valid integer number"); 
                           System.out.println("Please enter a valid integer");
                           arr1[j]=sc.next();
                           j--;
                         }            
                     }
                    BubbleThread b1= new BubbleThread(arr,n);
                    SelectionThread ss= new SelectionThread(arr,n); 
                    Quick q=new Quick();
                     
        b1.start();             
        ss.start();
    
    
     String str=Thread.currentThread().getName();
                          Quicksort st=new Quicksort(arr,0,n-1);
                          st.start();
                          try {
                           Thread.sleep(n*50);
                            } catch (InterruptedException ex) {
                             System.out.println(ex.getMessage());
                              }
                   //      String threads[]=Quicksort.fullthread.split(" ");
                        
                         System.out.print("\n sorted array is");
        for( int k=0;k<n;k++)
        {
        System.out.print(st.arr[k]+" ");
        }
                                  
                 
    }
    
    
    
    
}
