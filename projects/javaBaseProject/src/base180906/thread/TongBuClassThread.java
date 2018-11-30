package base180906.thread;

public class TongBuClassThread extends Thread{
	private TongBuClass tongbu;
	private TongBuThreadObject object;
	public TongBuClassThread(TongBuClass tongbu,TongBuThreadObject object){
		this.tongbu = tongbu;
		this.object = object;
	}
	@Override
	public void run(){
//		tongbu.test();
		tongbu.test2(object);
	}
}
