package multithreading;
class Numb implements Runnable
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println(i);
		}
	}
}
public class MultithreadingExample2
{
	public static void main(String args[])
	{
		Runnable obj1=new Numb();//can be reference of runnable inter
		Numb obj2=new Numb();
		Thread thread1=new Thread(obj1);//invokes threadclass constructor
		Thread thread2=new Thread(obj2);
		thread1.start();
		thread2.start();
	}
}
