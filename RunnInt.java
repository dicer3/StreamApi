class Th4 implements Runnable{

    @Override
    public void run() {
        System.out.println("be it");
    }
    
}
public class RunnInt {
    public static void main(String[] args) {
        Th4 t1 = new Th4();
        Thread th1 = new Thread(t1);
        th1.run();
    }
}
