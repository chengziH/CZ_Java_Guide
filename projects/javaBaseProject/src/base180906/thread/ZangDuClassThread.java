package base180906.thread;

public class ZangDuClassThread extends Thread{
	private ZangDuClass zangDu;
	public ZangDuClassThread(ZangDuClass zangDu){
		this.zangDu = zangDu;
	}
	@Override
	public void run(){
		zangDu.setValue1("huangxiulan", "123456");
	}
}
