
package sorting;


public class Selection {
    public int count=0;
  public  double executiontime;
    
    public void SelectionSort(int arr[], int size)
    {
         long starttime= System.nanoTime();
    
    for (int i=0;i<size;i++)
    {
    for(int j=i+1;j<size;j++)
    {
    if(arr[j]<arr[i])
    {
        System.out.println("\n Selection Sort : Values that are swapped "+ arr[j]+"  and  "+arr[i]);
    int temp;
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    count=count+3;
    
    }
    else {
    System.out.println(" Selection Sort : Values that are not swapped are "+ arr[i]+" and "+ arr[j]);
    
    }
    }
    
    
    }
    System.out.println("\n  Selection Sort : sorted array is:");
    for(int i=0;i<size;i++)
    System.out.println("  "+arr[i]);
    
    System.out.println(" Selection Sort : Complexity : "+ count);
    long  endtime=System.nanoTime();
long timetaken=endtime-starttime;
executiontime=timetaken/1000000;
System.out.print(" \n \n  Selection Sort : execution time in nano sec  :"+ timetaken);
    
System.out.print(" \n \n  Selection Sort : execution time in mili sec  :"+ executiontime);
    
    }
    
}
