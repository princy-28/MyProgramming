package sorting;
class Quicksort extends Thread {
       public int arr[];
        private int low,high;
        public static int numThreads = Runtime.getRuntime().availableProcessors();
        public static int count = 0,z=1,thrd=1;
        public static String fullthread=" ";
public Quicksort(int arr[], int low, int high)
{
          
            this.arr=arr;
            this.low = low;
            this.high = high;
  }
@Override
        public void run()
{           if(high>low)
            parallelQuicksort(arr,low,high);
            
 }
public static void quicksort(int[] arr, int low, int high){
            if (high>low){
               
                int i =partition(arr,low,high);
                quicksort(arr,low,i-1);
                quicksort(arr,i+1,high);
            }
        }
 synchronized public static  void parallelQuicksort(int[] arr, int low, int high){
        int i; 
        
        
        if (high>low)
            {
              String str;
       
                i = partition(arr,low,high);
                
              
                    Quicksort quicksort  = new Quicksort(arr, low, i-1);
                    str=quicksort .getName();
                    fullthread.concat(str);
                    fullthread.concat(" ");
                    System.out.println("Quick sort : running Thread "+str);
                    quicksort.start();
                    
                    
                
                    Quicksort quickst  = new Quicksort(arr, i+1, high);
                    str=quickst .getName();
                    fullthread.concat(str);
                    fullthread.concat(" ");
                    System.out.println("Quick sort : running Thread "+str);
                      quickst.start();
                     
              }
              else {
                 quicksort(arr,low,high);
                  
                          }
            }
                 
        

public static int partition(int[] arr, int start, int rear) 
        {      
        // taking last element of array as pivot element and storing it in x
    int x=arr[rear];
   
   int  i=start-1;
   
    for(int j=start;j<rear;j++)
    {
    if(arr[j]<= x)
    {
    i++;
    // swap a[i] with a[j]
     swap(arr,i,j);
       }
    
   }
   // exchange a[i+1] with a[rear]
   swap(arr,i+1,rear);
    
    System.out.println("\n \n Quick sort :array after "+z+" parition ");
               for(int a=start;a<=rear;a++)
               System.out.print(arr[a]+"  ");
               z++;
    
    return i+1;
    }
     
    public static void swap(int[] data, int i, int j){
            int tmp=data[i];
            data[i]=data[j];
            data[j]=tmp;
        }

  public static String Display() 
    {
         return Thread.currentThread().getName() ;
    }
}
  