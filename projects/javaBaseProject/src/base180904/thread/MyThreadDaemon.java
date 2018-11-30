package base180904.thread;

/**
 * 守护线程
 * @author asus
 *
 */
public class MyThreadDaemon extends Thread{
	private int i = 0 ;
	@Override
	public void run(){
		while(true){
			i ++ ;
			System.out.println("i="+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
