class Counter
{
   int count;
   public synchronized void increment()  //synchronized method helps to run the one thread at a time.
   {
      count++;
   }
}

public class learn
{
   public static void main(String args[]) throws InterruptedException
   {
     Counter c=new Counter();
      Runnable obj1=() ->  //implemented lambda expression.
           {
            for(int i=1;i<=2000;i++)
            {
              c.increment();
              
            }  
      };
      Runnable obj2=() ->
           {
            for(int i=1;i<=2000;i++)
            {
               c.increment();  //calling the method increment
            } 
      };
       Thread t1=new Thread(obj1);  //creating thread object because of the runnable interface.
       Thread t2=new Thread(obj2);

       t1.start();
       t2.start();

       t1.join();  //to avoid the execution of main and asks the main method to wait untill the threads completes its processes
       t2.join();

System.out.println(c.count);


   }
}