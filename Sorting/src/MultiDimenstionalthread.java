import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Bubble_sortT extends Thread
{
    int arr[], size;
 public   Bubble_sortT(int arr[],int size)
{
    this.arr=arr;
   this.size=size;
}
    @Override
  public void run()
  {
   Bubble_sort1(arr,size);   
  }  
  public  static  void Bubble_sort1(int arr[],int size)
 {  
     
for(int i=0;i<size-1;i++)
{
    for(int j=0;j<size-i-1;j++)  
    {  
        if (arr[j]>arr[j+1])
        {
         
            System.out.println(" \n  Bubble Sort :values that are swapped :"+ arr[j]+"  "+arr[j+1]);
         int  temp=arr[j];
           arr[j]=arr[j+1];
           arr[j+1]=temp;
           
        }else
        { 
           
        System.out.println(" \n Bubble Sort :values are not swapped are :"+ arr[j]+"  "+arr[j+1]);
        
        }
    }

}
System.out.println("\n sorted elements \n");
for(int i=0;i<size;i++)
 System.out.print(" "+arr[i]); 

    }
}

class MultiDimenstionalthread
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
            System.out.print("Enter the no. of  rows: "); //inputting number of rows
            int m=Integer.parseInt(br.readLine());
            System.out.print("Enter the no. of columns: "); //inputting number of columns
            int n=Integer.parseInt(br.readLine());
 
            int A[][]=new int[m][n]; //creating a 2D array
             int i,j,AC[]=new int[m];
             int AR[]=new int[n];
            /* Inputting the 2D Array */
 
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print("Enter the elements: ");
                    A[i][j]=Integer.parseInt(br.readLine());
                }
            }        
     
            /* Printing the original 2D Array */
 
            System.out.println("The original array:");
            for(i=0;i<m;i++)
            {
                for( j=0;j<n;j++)
                {
                   System.out.print(A[i][j]+"\t");
                }
                System.out.println();
            }
            
           // column wise sorting
            
        for (i = 0; i < m; i++) 
        { 
           for (j=0;j<n;j++)
            {
                AR[j]=A[i][j];
            }
        Bubble_sortT b1=new Bubble_sortT(AR,n);
       b1.start();
       
       for(j=0;j<n;j++)
       {
       A[i][j]=AR[j];    
             }
         
            } 
        
  
       
       // row wise sorting     
     for(i=0;i<n;i++)
     {
         for(j=0;j<m;j++)
         {
       AC[j]=A[j][i];  
         } 
        Bubble_sortT b2= new Bubble_sortT(AC,m);
      b2.start();
       for(j=0;j<m;j++)
       {
       A[j][i]=AC[j];    
             }
     }
  
            
}
}