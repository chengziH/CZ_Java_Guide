package base180903.thread;

import java.util.concurrent.Callable;

public class MyCallbable implements Callable<Integer> {
	private int i = 0 ;
	@Override
	public Integer call() throws Exception {
		System.out.println("int MyCallable call() ");
		int sum = 0 ;
		for(i = 0 ; i < 100 ; i++){
			System.out.println(" in MyCallable " + Thread.currentThread().getName()+"    "+i);
			sum = sum + i;
		}
		return sum;
	}
}
