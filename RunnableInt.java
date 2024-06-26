class MyThread1 implements Runnable{

    @Override
    public void run(){
       System.out.println("I am Thread Class");
    }
}

class MyThread2 implements Runnable{

    @Override
    public void run(){
       System.out.println("I am Thread Class 2");
    }
}

public class RunnableInt {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread1());
        Thread t2 = new Thread(new MyThread2());
    
        t1.start();
        t2.start();
    }

}
