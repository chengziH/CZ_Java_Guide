package base180911.thread;

import java.util.ArrayList;
import java.util.List;
/**
 * 等待、通知机制
 * @author asus
 *
 */
public class MyWaitList {
	public static List<String> list = new ArrayList<>();
	public static void addList(){
		list.add("anyString");
	}
	public static int size(){
		return list.size();
	}
}
