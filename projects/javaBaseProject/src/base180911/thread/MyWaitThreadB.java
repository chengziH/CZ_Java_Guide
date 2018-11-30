package base180911.thread;
/**
 * 等待、通知机制
 * @author asus
 *
 */
public class MyWaitThreadB extends Thread{
	private Object object;
	public MyWaitThreadB(Object object){
		this.object = object;
	}
	@Override
	public void run(){
		try {
			synchronized (object) {
				for(int i = 1 ; i <= 10 ; i ++ ){
					MyWaitList.addList();
					if(MyWaitList.size() == 5){
						object.notify();
						System.out.println("已发出通知！");
					}
					System.out.println("已添加了"+i+"个元素");
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
