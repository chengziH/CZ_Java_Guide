package base180904.thread;

public class MyThreadPriorityTest {
	public static void main(String[] args){
		MyThreadPriority1 myThreadPriority1 = new MyThreadPriority1();
		myThreadPriority1.setPriority(10);
		myThreadPriority1.start();
	}
}
