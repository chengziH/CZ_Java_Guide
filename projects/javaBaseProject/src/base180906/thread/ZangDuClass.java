package base180906.thread;

/**
 * 脏读
 * @author asus
 */
public class ZangDuClass {
	private String userName = "chengzi";
	private String password = "888888";
	public synchronized void setValue(String userName,String password){
		try {
			this.userName = userName;
			Thread.sleep(5000);
			this.password = password;
			System.out.println("setValue method thread name = "+Thread.currentThread().getName()+
					"    userName = "+userName + "   password = "+password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public synchronized void getValue(){
		System.out.println("getValue method thread name = "+Thread.currentThread().getName()+
				"    userName = "+userName + "   password = "+password);
	}
	
	public void setValue1(String userName,String password){
		try {
			this.userName = userName;
			Thread.sleep(5000);
			synchronized (this) {
				//同步快代码体 
//				当一个线程访问一个对象的synchronized同步代码块时，另一个线程任然可以访问该对象非synchronized同步代码块
//				不在synchronized代码块中就异步执行，在synchronized代码块中就是同步执行。
			}
			this.password = password;
			System.out.println("setValue method thread name = "+Thread.currentThread().getName()+
					"    userName = "+userName + "   password = "+password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
