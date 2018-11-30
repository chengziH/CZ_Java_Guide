package base180907.thread;

public class VolatileThreadTest {
	public static void main(String[] args) throws InterruptedException{
		VolatileThread thread = new VolatileThread();
		thread.start();
		thread.sleep(1000);
		thread.setRunning(false);
		System.out.println(thread.getName() + "isRunning 已经赋值为false");
		
		
//		while(value=="test"){
//			doSomething();
//		}
//		
	}
}
