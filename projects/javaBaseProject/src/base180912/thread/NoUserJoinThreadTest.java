package base180912.thread;
/**
 * 不使用join（）方法演示
 * @author asus
 */
public class NoUserJoinThreadTest {
	public static void main(String[] agrs) throws InterruptedException{
		NoUserJoinThread thread = new NoUserJoinThread();
		thread.start();
		thread.join();
		System.out.println("运行结束！");
	}
}
class NoUserJoinThread extends Thread{
	@Override
	public void run(){
		System.out.println("进入 run（）方法 ");
	}
}
