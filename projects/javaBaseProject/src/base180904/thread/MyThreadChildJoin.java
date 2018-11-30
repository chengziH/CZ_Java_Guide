package base180904.thread;

public class MyThreadChildJoin extends Thread{

	@Override
	public void run() {
		int sum = 0;
		for(int i = 0 ; i < 999999999 ; i++){
			sum = sum + i;
		}
		System.out.println("MyThreadChildJoin 打印 sum = " + sum);
	}
}
