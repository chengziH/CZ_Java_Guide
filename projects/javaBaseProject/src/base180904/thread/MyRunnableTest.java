package base180904.thread;

public class MyRunnableTest {
	public static void main(String[] agrs){
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
		System.out.println("运行结束！");
	}
}
