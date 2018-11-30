package base180904.thread;

public class MyThread extends Thread{
	int count = 5;
	@Override
	public synchronized void run(){
		count -- ;
		System.out.println("由线程"+MyThread.currentThread().getName()+"计算，count = "+count);
	}
}
