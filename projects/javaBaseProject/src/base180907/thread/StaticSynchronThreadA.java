package base180907.thread;

public class StaticSynchronThreadA extends Thread{
	private StaticSynchronClass staticClass ;
	public StaticSynchronThreadA(StaticSynchronClass staticClass){
		this.staticClass = staticClass;
	}
	@Override
	public void run(){
		staticClass.printA();
	}
}
