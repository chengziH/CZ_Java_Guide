package base180904.thread;

public class MyThreadJoin extends Thread{
	@Override
	public void run() {
		System.out.println("in MyThreadJoin run");
		int sum = 0;
		for(int i = 0 ; i < 999999999 ; i++){
			sum = sum + i;
		}
		System.out.println("MyThreadJoin 打印 sum = " + sum);
	}
}
