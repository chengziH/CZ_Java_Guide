package base180907.thread;

public class StaticSynchronThreadC extends Thread{
	private StaticSynchronClass staticClass ;
	public StaticSynchronThreadC(StaticSynchronClass staticClass){
		this.staticClass = staticClass;
	}
	@Override
	public void run(){
		staticClass.printC();
	}
}
