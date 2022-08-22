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