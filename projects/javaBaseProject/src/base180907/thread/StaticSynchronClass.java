package base180907.thread;
/**
 * 静态同步类
 * @author asus
 */
public class StaticSynchronClass {
	/** 静态方法  synchronized锁定不是对象，是类*/
	public static void printA(){
		synchronized (StaticSynchronClass.class) {
			try {
				System.out.println("线程：" + Thread.currentThread().getName() + "在"+System.currentTimeMillis()+"进入printA方法");
				Thread.sleep(2000);
				System.out.println("线程：" + Thread.currentThread().getName() + "在"+System.currentTimeMillis()+"离开printA方法");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized static void printB(){
		System.out.println("线程：" + Thread.currentThread().getName() + "在"+System.currentTimeMillis()+"进入printB方法");
		System.out.println("线程：" + Thread.currentThread().getName() + "在"+System.currentTimeMillis()+"离开printB方法");
	}
	public synchronized void printC(){
		System.out.println("线程：" + Thread.currentThread().getName() + "在"+System.currentTimeMillis()+"进入printC方法");
		System.out.println("线程：" + Thread.currentThread().getName() + "在"+System.currentTimeMillis()+"离开printC方法");
	}
}
