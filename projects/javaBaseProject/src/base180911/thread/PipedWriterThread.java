package base180911.thread;

import java.io.PipedOutputStream;
/**
 * 写  线程
 */
public class PipedWriterThread extends Thread{
	private PipedWriterDataClass writerData;
	private PipedOutputStream outputStream;
	public PipedWriterThread(PipedWriterDataClass writerData,PipedOutputStream outputStream){
		this.writerData = writerData;
		this.outputStream = outputStream;
	}
	@Override
	public void run(){
		writerData.writerMethod(outputStream);
	}
}
