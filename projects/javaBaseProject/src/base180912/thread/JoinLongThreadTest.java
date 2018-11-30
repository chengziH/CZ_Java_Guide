package base180912.thread;

public class JoinLongThreadTest {
	public static void main(String[] agrs) throws InterruptedException{
		JoinLongThread thread = new JoinLongThread();
		thread.start();
		thread.join(2000); // join只等待2秒
		System.out.println("end time = " + System.currentTimeMillis());
		System.out.println("main方法执行结束！");
	}
}
class JoinLongThread extends Thread{
	@Override
	public void run(){
		try {
			System.out.println("start time = " + System.currentTimeMillis());
			Thread.sleep(10000); // 休眠十秒
			System.out.println("run end time = " + System.currentTimeMillis());
			System.out.println("run方法执行结束！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
}
