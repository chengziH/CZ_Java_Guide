package base180904.thread;

/**
 * 线程的优先级继承性
 * @author asus
 */
public class MyThreadPriority2 extends Thread{
	@Override
	public void run(){
		System.out.println("MyThreadPriority2 优先级为 = "+MyThreadPriority2.currentThread().getPriority());
	}
}
