package base180906.thread;

public class TongBuClassThreadTest {
	public static void main(String[] args) {
		TongBuThreadObject objectA = new TongBuThreadObject();
		TongBuThreadObject objectB = new TongBuThreadObject();
		TongBuClass tongBuClass = new TongBuClass();
		TongBuClassThread threadA = new TongBuClassThread(tongBuClass,objectA);
		threadA.setName("A");
		threadA.start();
		TongBuClassThread threadB = new TongBuClassThread(tongBuClass,objectB);
		threadB.setName("B");
		threadB.start();
	}
}







// 同步语句块测试
//TongBuClass tongbu = new TongBuClass();
//TongBuClassThread thread1 = new TongBuClassThread(tongbu);
//TongBuClassThread thread2 = new TongBuClassThread(tongbu);
//thread1.setName("线程一");
//thread2.setName("线程二");
//thread1.start();
//thread2.start();