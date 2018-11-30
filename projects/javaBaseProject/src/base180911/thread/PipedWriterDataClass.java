package base180911.thread;

import java.io.IOException;
import java.io.PipedOutputStream;
/**
 * 面向字节 管道输出流（写）
 * @author asus
 */
public class PipedWriterDataClass {
	public void writerMethod(PipedOutputStream outputStream){
		try {
			System.out.println("writer start : ");
			for(int i = 0 ; i <= 100 ; i ++){
				String writerData = "【测试】 " + (i + 1) + "  ";
				outputStream.write(writerData.getBytes());
				System.out.print("writerData="+writerData);
			}
			System.out.println("writer end : ");
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
