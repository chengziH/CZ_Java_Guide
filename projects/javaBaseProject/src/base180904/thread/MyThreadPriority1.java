package base180904.thread;

/**
 * 线程的优先级继承性
 * @author asus
 */
public class MyThreadPriority1 extends Thread{
	@Override
	public void run(){
		System.out.println("MyThreadPriority1 优先级为 = "+MyThreadPriority1.currentThread().getPriority());
		MyThreadPriority2 myThreadPriority2 = new MyThreadPriority2();
		myThreadPriority2.run();
	}
}
