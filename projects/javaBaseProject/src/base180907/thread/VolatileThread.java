package base180907.thread;

/**
 * volatile关键字
 * @author asus
 *
 */
public class VolatileThread extends Thread{
	volatile private boolean isRunning = true;
	int m ; 
	public boolean isRunning() {
		return isRunning;
	}
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName()+"进入run");
		while(isRunning == true){
			int a = 2;
			int b = 3;
			int c = a + b ;
			m = c;
		}
		System.out.println(Thread.currentThread().getName()+"m="+m);
		System.out.println(Thread.currentThread().getName()+"线程被停止了！");
	}
}
