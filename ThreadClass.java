class MyThread1 extends Thread{
    
    public void run(){
        for(int i=0;i<15;i++){
            System.out.println("running in first thread");
        }
    }
}

class MyThread2 extends Thread{
    
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("running in second thread");
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.getName();
        t2.getName();
        t1.start();
        t2.start();
    }
}
