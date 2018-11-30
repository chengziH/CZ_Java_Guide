package base180905.thread;

public class MyThreadTest {
	public static void main(String[] args) throws InterruptedException {
		HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
		MyThread myThreadA = new MyThread(numRef1);
		myThreadA.setName("A");
		MyThread myThreadB = new MyThread(numRef1);
		myThreadB.setName("B");
		myThreadA.start();
		myThreadB.start();
	}
}
