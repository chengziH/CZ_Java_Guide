package base180906.thread;

public class ZangDuClassThreadTest {
	public static void main(String[] args){
		try {
			ZangDuClass zangDu = new ZangDuClass();
			ZangDuClassThread thread = new ZangDuClassThread(zangDu);
			thread.start();
			thread.sleep(2000);
			zangDu.getValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
