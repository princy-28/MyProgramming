
package sorting;


public class SelectionThread extends Thread{
    int arr[],size,count=0;
    
    SelectionThread(int arr[],int n)
    {
       
        this.arr=arr;
        this.size=n;
    }
    
    @Override
 public void run()
    {
    Selection ss=new Selection();
    ss.SelectionSort(this.arr,this.size);
    }
         
}
    