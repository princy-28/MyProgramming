
package sorting;
public class Quick {
    
   long starttime= System.nanoTime();
   // z is the variable that count no. of parition   
   int z=1;
    // count is used to count the no. of time loop is executed for for calculating time complexity
    int count=0;
    // start is initial position of array whereas  rear is end of array
    // QuickSorting takes three argument : array,start,rear
    public  void QuickSorting(int arr[], int start,int rear)
 {
     // middle is a variable name that hole the position of an array 
     //that is returned by Partition Method after placing a element its correct position
               int middle;
               if(start<rear)
               {
                  middle= Partition(arr,start,rear);
                QuickSorting(arr,start,rear-1);
                QuickSorting(arr,middle+1,rear);
              }
               
 }
    
    private int Partition(int arr[],int start, int rear)
    {
        int temp;
        // taking last element of array as pivot element and storing it in x
    int x=arr[rear];
    count++;
   int  i=start-1;
   count++;
    for(int j=start;j<rear;j++)
    {
    if(arr[j]<= x)
    {
    i++;
    // swap a[i] with a[j]
     temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    count=count+3;
    }
    
   }
   // exchange a[i+1] with a[r]
    temp= arr[i+1];
    arr[i+1]=arr[rear];
    arr[rear]=temp;
    count=count+3;
    
    System.out.println("\n \n array after "+z+" parition ");
               for(int a=start;a<=rear;a++)
               System.out.print(arr[a]+"  ");
               z++;
    
    return i+1;
    }
     long  endtime=System.nanoTime();
long timetaken=endtime-starttime;
//System.out.print(" \n \n  execution time in mili sec  :"+ timetaken/1000000);

}