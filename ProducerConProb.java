class Company {
    int n;
    boolean f=false;
    synchronized public void produce_item(int n){
        this.n = n;
        if(f){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Produced :"+this.n);
        f=true;
        notify();
    }

    synchronized public int consume_item(){
        if(!f){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed :"+this.n);
        f=false;

        return this.n;
    }
}

class Producer extends Thread{
    Company c;

    Producer(Company c){
        this.c = c;
    }

    public void run(){
        while(true){
            int i=1;
            this.c.produce_item(i);
            try {
                Thread.sleep(100);
            } catch(Exception e){
               e.printStackTrace();
            }
            i++;
        }
    }
}

class Consumer extends Thread{
    Company c;

    Consumer(Company c){
        this.c = c;
    }

    public void run(){
        while(true){
            this.c.consume_item();
            try {
                Thread.sleep(100);
            } catch(Exception e){
               e.printStackTrace();
            }
        }
    }
}
public class ProducerConProb {
    public static void main(String[] args) {
        Company comp = new Company();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);
        p.start();
        c.start();
    }
}
