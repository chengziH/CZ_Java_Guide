package base180907.thread;

public class StaticSynchronThreadB extends Thread{
	private StaticSynchronClass staticClass ;
	public StaticSynchronThreadB(StaticSynchronClass staticClass){
		this.staticClass = staticClass;
	}
	@Override
	public void run(){
		staticClass.printB();
	}
}
