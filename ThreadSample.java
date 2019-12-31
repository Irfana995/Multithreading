package multithreading;

public class ThreadSample extends Thread
{
	public static void main(String args[])
	{
		ThreadSample t1=new ThreadSample();
		t1.start();
	}
	public void run()
	{
		System.out.println("Am in run method by extending thread");
	}
}
