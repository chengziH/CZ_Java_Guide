package base180911.thread;
/**
 * 等待、通知机制测试
 * @author asus
 *
 */
public class MyWaitThreadTest {
	public static void main(String[] agrs){
		try {
			Object object = new Object();
			MyWaitThreadA threadA = new MyWaitThreadA(object);
			threadA.start();
			Thread.sleep(100);
			threadA.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
//		try {
//			Object object = new Object();
//			MyWaitThreadA threadA = new MyWaitThreadA(object);
//			threadA.start();
			
//			Thread.sleep(50);
//			MyWaitThreadB threadB= new MyWaitThreadB(object);
//			threadB.start();
//			
//			Thread.sleep(50);
//			MyWaitThreadC threadC= new MyWaitThreadC(object);
//			threadC.start();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
}
