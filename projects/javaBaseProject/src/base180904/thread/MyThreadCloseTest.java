package base180904.thread;

public class MyThreadCloseTest {
	public static void main(String[] args) throws InterruptedException{
		MyThreadClose myThreadClose = new MyThreadClose();
		myThreadClose.start();
		myThreadClose.sleep(1000);
		myThreadClose.interrupt();
	}
}
