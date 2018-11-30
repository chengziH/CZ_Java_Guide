package base180911.thread;

import java.io.PipedInputStream;

/**
 * 读  线程
 */
public class PipedReadThread extends Thread{
	private PipedReadDataClass readData; 
	private PipedInputStream inputStream;
	public PipedReadThread(PipedReadDataClass readData,PipedInputStream inputStream){
		this.readData = readData;
		this.inputStream = inputStream;
	}
	@Override
	public void run(){
		readData.readMethod(inputStream);
	}
}
