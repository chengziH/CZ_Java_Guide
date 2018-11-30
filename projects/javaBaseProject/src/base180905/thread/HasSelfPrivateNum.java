package base180905.thread;

public class HasSelfPrivateNum {
	private int num = 0;
	public synchronized void getNum(String threadName){
		if("A".equalsIgnoreCase(threadName)){
			num = 100;
			System.out.println("A set num");
		}else if("B".equalsIgnoreCase(threadName)){
			num = 200;
			System.out.println("B set num");
		}
		System.out.println(threadName + " num = "+num);
	}
}
