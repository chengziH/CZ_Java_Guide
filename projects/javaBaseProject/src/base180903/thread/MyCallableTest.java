package base180903.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallableTest {
	public static void main(String[] args) {
		Callable<Integer> myCallbable = new MyCallbable(); // 创建Callable实现类实例对象
		FutureTask<Integer>  ft = new FutureTask<>(myCallbable); // 使用FutureTask来包装myCallable对象
		for(int i = 0 ; i < 100 ; i ++){
			System.out.println(" in MyCallableTest" + Thread.currentThread().getName()+"     "+i);
			if(i == 30){
				Thread thread = new Thread(ft);// FutureTask 对象作为Thread的target创建真正的线程对象
				thread.start();// 线程对象Thread进入就绪状态thread.start();// 线程对象Thread进入就绪状态
			}
		}
		System.out.println("主体线程执行完毕！");
		try {
			int sum = ft.get(); // 取得线程call方法返回的结果
			System.out.println("sum = "+sum); // 4950
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
