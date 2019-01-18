/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;


 class BubbleThread extends Thread {
       int arr[],size;  
public BubbleThread(int arr[],int n)
     {
     this.arr=arr;
     this.size=n;
     }
    @Override
   public void run()
    {
      Bubble bb=new Bubble();
      bb.Bubble(this.arr, this.size);
      
        
    }
 }
     
  