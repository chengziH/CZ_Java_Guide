package base180904.thread;

public class MyThreadTest {
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		System.out.println("myThread 优先级 = "+myThread.getPriority()); // 线程的默认优先级是 5 

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Thread threadA = new Thread(myThread,"A");
//		Thread threadB = new Thread(myThread,"B");
//		Thread threadC = new Thread(myThread,"C");
//		Thread threadD = new Thread(myThread,"D");
//		Thread threadE = new Thread(myThread,"E");
//		threadA.start();
//		threadB.start();
//		threadC.start();
//		threadD.start();
//		threadE.start();
//		System.out.println("threadA 优先级 = "+threadA.getPriority());
//		System.out.println("threadB 优先级 = "+threadB.getPriority());
//		System.out.println("threadC 优先级 = "+threadC.getPriority());
//		System.out.println("threadD 优先级 = "+threadD.getPriority());
//		System.out.println("threadE 优先级 = "+threadE.getPriority());
		
//		// 常用发放
//		MyThread myThread = new MyThread();
//		myThread.start();
//		myThread.currentThread();// 返回对当前正在执行的线程对象的引用。
//		myThread.getId();// 返回该线程的标识符
//		myThread.getName(); // 返回该线程的名称
//		myThread.getPriority(); // 返回该线程的优先级
//		myThread.isAlive();// 测试该线程是否处于活动状态  活动状态：线程已经启动且尚未停止，即线程是否处于正在运行或者准备运行的状态
//		myThread.sleep(100000); // 指正在运行的线程以指定的毫秒数休眠（暂时停止运行），具体取决于系统定时器和调度程序的精确和准时性
//		myThread.interrupt();// 中断该线程
//		myThread.interrupted(); // 测试该线程是否处于中断状态，同时中断该线程
//		myThread.isInterrupted(); // 测试该线程是否处于中断状态，不中断该线程
//		myThread.setName("A线程"); // 对该线程设置名称
//		myThread.isDaemon() ;// 测试该线程是否是守护线程
//		myThread.setDaemon(true); // 设置该线程为守护线程，true：守护线程；false：用户线程
//		myThread.join(); // 很多情况下，主线程生成并启动了很多子线程，如果子线程里要进行大量的耗时的运算，主线程往往将于子线程之前结束，但是如果主线程处理完其他的事物后，需要用到子线程的处理结果，也就是说主线程需要等待子线程执行完成之后再结束，这个时候就要用到join方法
////		join()作用：等待该线程执行完毕。主线程代码里，被子线程调用jion() 方法后面的程序代码需子线程完全执行完毕后才会被执行。
//		myThread.yield(); // 放弃当前的CPU资源，即线程的运行状态转换为就绪状态。 放弃的时间是不确定的，存在处理器下一次调度又重新运行的可能，因为CPU的调度是随机的。
//		myThread.setPriority(1); // 更改次线程的优先级
//		myThread.stop();
//		myThread.suspend();
//		myThread.resume();
		
	}
}

// 不共享
//MyThread myThreadA = new MyThread("A");
//MyThread myThreadB = new MyThread("B");
//MyThread myThreadC = new MyThread("C");
//myThreadA.start();
//myThreadB.start();
//myThreadC.start();
//System.out.println("运行结束！");




// 共享
//MyThread myThread = new MyThread();
//Thread threadA = new Thread(myThread,"A");
//Thread threadB = new Thread(myThread,"B");
//Thread threadC = new Thread(myThread,"C");
//Thread threadD = new Thread(myThread,"D");
//Thread threadE = new Thread(myThread,"E");
//threadA.start();
//threadB.start();
//threadC.start();
//threadD.start();
//threadE.start();