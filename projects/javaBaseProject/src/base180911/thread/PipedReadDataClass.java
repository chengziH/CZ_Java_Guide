package base180911.thread;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * 面向字节 管道输入流（读）
 * @author asus
 */
public class PipedReadDataClass {
	public void readMethod(PipedInputStream inputStream){
		try {
			System.out.println("read start : ");
			byte[] bytes = new byte[1024];
			int readLength = inputStream.read(bytes);
			while(readLength != -1){
				String readData = new String(bytes,0,readLength);
				System.out.println();
				System.out.println("readData = "+readData);
				readLength = inputStream.read(bytes);
			}
			System.out.println("read end : ");
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
