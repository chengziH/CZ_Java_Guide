package base180904.thread;

public class MyThreadJoinTest {
	public static void main(String[] args) throws InterruptedException {
		MyThreadJoin myThreadJoin = new MyThreadJoin();
		myThreadJoin.start();
		myThreadJoin.sleep(6000);
		myThreadJoin.join();
		System.out.println("MyThreadJoinTest 执行结束！");
	}
}
