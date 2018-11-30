package base180906.thread;

/**
 * 同步语块
 * @author asus
 */
public class TongBuClass {
	public void test2(TongBuThreadObject object){
		synchronized (object) {
			try { 
				System.out.println("testMethod1 ____getLock time=" + System.currentTimeMillis() 
					+ " run ThreadName=" + Thread.currentThread().getName()); 
				Thread.sleep(2000); 
				System.out.println("testMethod1 releaseLock time=" 
						+ System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName()); 
			} catch (InterruptedException e) { 
				e.printStackTrace(); 
			}
		}
	}
	
	public void test(){
		try {
			System.out.println(Thread.currentThread().getName()+"  111");
			synchronized (this) {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+"  执行同步语块");
			}
			System.out.println(Thread.currentThread().getName()+"  222");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
