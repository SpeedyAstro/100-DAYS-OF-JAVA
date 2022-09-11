class MyThread implements Runnable{
    @Override
    public void run() {
        while(true) System.out.println("run method ->   <-");
    }
}
public class ThreadLifeCycle {
    public static void main(String[] args) {
        /*
         * creating threads using Runnable Interface 
         * 1. inherits the runnable interface 
         * 2. override the run method
         * 3. creates the instance of the class
         * 4. create the instance of thread class and pass the previous class instance in the thread class
         */
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
        while(true) System.out.println("Main method ");
    }
    /*
     * Life cycle o 
     * 1. Born  - New thread is created 
     * 2. Runnable  - in this stage thread comes in ready stage
     * 3. Running   - thread task execution ie. run method executing
     * 4. Non - Runnable    - in this stage thread do not perform any task , but when the thread is invoked then thread goes to runnable state and then it resume to running stage
     * 5. Dead  - In this task thread completed its task and removed from the memory successfully 
     */
}
