package sorting;
import java.util.Scanner;
 public class Bubble

{ 
      public double milisec;
      public int count =0;
    public void Bubble(int arr[],int n)
    {
  
        long starttime= System.nanoTime();
         int count=0;
       Scanner sc=new Scanner(System.in); 
        int temp;
        

 // Bubble via bubble Bubble 
for(int i=0;i<n-1;i++)
{
    for(int j=0;j<n-i-1;j++)  
    {  
        if (arr[j]>arr[j+1])
        {
          count=count+3;
            System.out.println(" \n  Bubble Sort :values that are swapped :"+ arr[j]+"  "+arr[j+1]);
           temp=arr[j];
           arr[j]=arr[j+1];
           arr[j+1]=temp;
           
        }else
        { 
           
        System.out.println(" \n Bubble Sort :values are not swapped are :"+ arr[j]+"  "+arr[j+1]);
        
        }
    }
    System.out.println(" \n Bubble Sort : after "+i+" loop array : \n ");
            
for(int k=0;k<n;k++)
{ 
System.out.print(arr[k] +"  ");
}   
    
    }
System.out.println(" \n Bubble Sort : Sorted array :");
for(int i=0;i<n;i++)
{ 
  System.out.print (arr[i]+ " " );
}
long  endtime=System.nanoTime();
long timetaken=endtime-starttime;
 milisec= timetaken/1000000 ;
System.out.print(" \n \n Bubble Sort : execution time in nano sec  :"+ timetaken);
System.out.print(" \n \n  Bubble Sort : execution time in mili sec  :"+ milisec);
System.out.println("\n \n Bubble Sort : Time Complexity"+ count);
    }

 
 
 }



   
    
    
    
   
    
    