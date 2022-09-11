// package Multithreading;

// package Multithreading;
// By using thread class 
        //1 inherits the thread class
        //2 override the run method
        //3 create an instance of class
        //4 start the thread
class test extends Thread{
    @Override
    public void run(){
        int t = 100;
        while(t-->0){
            System.out.println("this is second thread!");
        }
    }
}
public class CreatinThread extends Thread{

    @Override
    public void run(){
        int t = 100;
        while(t--> 0){
            System.out.println("this is first thread!");
        }
    }
    public static void main(String[] args) {
        CreatinThread ct = new CreatinThread();
        ct.start();
        test t =new test();
        t.start();
    }
}
/*
 * What is the use of start() method
 * start method of thread class is implemented as when it is called a new Thread is created and code inside run() method is executed in that new Thread.
 * While if run method is executed directly than no new Thread is created and code inside run() will execute on current Thread and no multi-threading will take place.
 * 	Invocation
 * start method can't be invoked more than once on same object otherwise it will throw java.lang.IllegalThreadStateException.
 * run method on other hand do not throws any type of exception if it is being get called more than once.So multiple invocation is possible in case of run method.
 */

 /*
  * what is the use of start () method -
  1. It register the therad with thread scheduler
  2.It will execute the all the mendatory functionalities related to thread 
  3. It will invoke the run method
  */