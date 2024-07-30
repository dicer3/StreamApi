class MyTh3 extends Thread{
    @Override
    public void run(){
        System.out.println("nice");
    }
}
public class ThreadClass2 {
    public static void main(String[] args) {
        Thread t1 = new MyTh3();
        t1.start();
    }
}
