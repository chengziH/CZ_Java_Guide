package base180911.thread;
/**
 * 等待、通知机制
 * @author asus
 *
 */
public class MyWaitThreadA extends Thread{
	private Object object;
	public MyWaitThreadA(Object object){
		this.object = object;
	}
	@Override
	public void run(){
		try {
			synchronized (object) {
				if(MyWaitList.size() != 5){
					System.out.println("wait begin = "+System.currentTimeMillis());
					object.wait();
					System.out.println("wait end = "+System.currentTimeMillis());
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
