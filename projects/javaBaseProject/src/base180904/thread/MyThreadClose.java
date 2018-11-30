package base180904.thread;

/**
 * 线程关闭，停止，中断
 * @author asus
 */
public class MyThreadClose extends Thread{
	@Override
	public void run(){
		for(int i = 0 ;i <= 500000 ; i++){
			if(this.isInterrupted()){
				System.out.println("该线程已停止，我要退出循环！"+Thread.currentThread().isInterrupted()); // true
				break;
			}
			System.out.println("i="+i);
		}
		System.out.println("运行循环结束！");
	}
}
