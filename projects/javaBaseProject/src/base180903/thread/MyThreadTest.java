package base180903.thread;

public class MyThreadTest {
	public static void main(String[] args){
		//在MyRunnable和MyThread都重写run方法的情况下，使用MyRunnable的实例对象作为MyThread的target创建线程对象时，
		//调用start()方法会执行MyThread的线程执行体
		Runnable MyRunnable = new MyRunnable();
		Thread thread = new MyThread(MyRunnable);
		thread.start(); 
//		for(int i = 0 ; i < 100 ; i++){
//			System.out.println(Thread.currentThread().getName()+"          "+i);
//			if(i == 30){
//				MyThread myThread1 = new MyThread();//创建一个新的线程，myThread1此线程进入新建状态
//				MyThread myThread2 = new MyThread();//创建一个新的线程，myThread2此线程进入新建状态
//				myThread1.start();//调用就绪方法，myThread1此线程进入就绪状态
//				myThread2.start();//调用就绪方法，myThread2此线程进入就绪状态
//			}
//		}
	}
}
