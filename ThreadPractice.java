//Creating thread using Thread class
class MyAnotherThread extends Thread
{
	public void run()
	{
		//task for thread
		for(int i=10;i>=1;i--)
		{
			System.out.println("another thread = "+i);

			// try
			// {
			// 	Thread.sleep(2000);
			// }catch(Exception e)
			// {

			// }
		}
	}

	
}

class MyThread implements Runnable
{
	public void run()
	{
		//task for thread...
		for(int i=1;i<=10;i++){

			System.out.println("value of i is "+i);
			// try{
			// 	//Thread.sleep(1000);
			// }catch(Exception e){
			// }
		}
	}
}    
public class ThreadPractice {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
		Thread thr=new Thread(t1);
		//object of AnotherThread
		MyAnotherThread t2=new MyAnotherThread();
        thr.setName("pragun ");
        System.out.println("ok "+thr.getName());
        System.out.println("ok !! "+t2.getName());
		thr.start();
		t2.start();
    }
}
