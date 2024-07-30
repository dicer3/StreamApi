public class ThreadFns {
    public static void main(String[] args) {
        System.out.println("pragun started ...");
        int x=56+34;
        System.out.println("sum is "+x);

        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("current thread running is "+tname);
    }
}
