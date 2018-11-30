package base180905.thread;

public class MyThread extends Thread{
	private HasSelfPrivateNum numRef;
	
	public MyThread(HasSelfPrivateNum numRef){
		this.numRef = numRef;
	}
	@Override
	public synchronized void run(){
		numRef.getNum(MyThread.currentThread().getName());
	}
}
