package base180904.thread;

public class MyThreadDaemonTest {
	public static void main(String[] agrs){
		MyThreadDaemon myThreadDaemon = new MyThreadDaemon();
		myThreadDaemon.setDaemon(true);
		myThreadDaemon.start();
		try {
			myThreadDaemon.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("停止运行！");
	}

}
