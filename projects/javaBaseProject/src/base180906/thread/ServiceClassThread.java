package base180906.thread;

public class ServiceClassThread extends Thread{
	@Override
	public void run(){
		ServiceClass service = new ServiceClass();
		service.service1();
	}
}
