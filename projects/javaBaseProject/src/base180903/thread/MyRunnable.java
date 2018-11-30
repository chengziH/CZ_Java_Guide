package base180903.thread;

public class MyRunnable implements Runnable{
	private boolean isStop ; 
	@Override
	public void run() {
		for(int i = 0 ; i <= 100 && !isStop; i ++){
			System.out.println("in MyRunnable " + Thread.currentThread().getName()+"    "+i);
		}
	}
	public void stopThread(){
		this.isStop = true;
	}
}
