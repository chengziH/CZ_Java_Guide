package base180903.thread;

public class MyRunnableTest {
	public static void main(String[] args){
		MyRunnable myRunnable = new MyRunnable(); //创建Runnable实现类对象
		Thread thread1 = new Thread(myRunnable); //将myRunnable 作为Thread的target创建真正的线程对象
		for(int i = 0 ; i <= 30 ; i++){
			System.out.println("in MyRunnableTest " + Thread.currentThread().getName() + "    "+i);
			if(i == 10){
				thread1.start();// 线程对象进入就绪状态
			}
			if(i == 20){
				myRunnable.stopThread();// 线程对象进入就绪状态
			}
		}
	}
}
