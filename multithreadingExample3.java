package multithreading;
class MusicPlayer extends Thread//MusicPlayer extends from Thread class
{
	public void run()
	{
		System.out.println("Music is Playing");
	}
}
class Msword implements Runnable//Msword implements from Runnable interface
{
	public void run()
	{
		System.out.println("Typing Ms word");
	}
}
public class multithreadingExample3
{
	public static void main(String args[])
	{
		MusicPlayer thread1=new MusicPlayer();
		Runnable runnableobj=new Msword();
		Thread thread2=new Thread(runnableobj);
		thread1.start();
		thread2.start();
	}
}
