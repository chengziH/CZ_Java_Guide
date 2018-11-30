package base180911.thread;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.Semaphore;

/**
 * 管道输入输出流测试
 * @author asus
 *
 */
public class PipedThreadTest {
	public static void main(String[] args) throws IOException, InterruptedException{
		PipedWriterDataClass writerData = new PipedWriterDataClass();
		PipedReadDataClass readData = new PipedReadDataClass();
		
		PipedOutputStream outputStream = new PipedOutputStream();
		PipedInputStream inputStream = new PipedInputStream();
		
		outputStream.connect(inputStream);
		
		PipedReadThread readThread = new PipedReadThread(readData,inputStream);
		readThread.start();
		
		Thread.sleep(2000);
		
		PipedWriterThread writerThread = new PipedWriterThread(writerData,outputStream);
		writerThread.start();
		
	}
}
