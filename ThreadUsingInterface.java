package multithreading;

public class ThreadUsingInterface implements Runnable
{
	public static void main(String args[])
	{
		ThreadUsingInterface ts=new ThreadUsingInterface();
		Thread t1=new Thread(ts);
		t1.start();
	}
	public void run()
	{
		System.out.println("Am in run method by implementing runnable");
	}
}
