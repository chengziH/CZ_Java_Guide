package test;

import org.junit.Test;
import com.base.service.OneService;
import com.base.service.TwoService;
import com.base.spring.SpringContext;
public class SpringTwoTest {
	
	@Test
	public void test(){
		OneService oneService = (OneService) SpringContext.getInstance().getBean("oneService");
		System.out.println(oneService.say("我要说的话1"));
		
		TwoService twoService = (TwoService) SpringContext.getInstance().getBean("twoService");
		System.out.println(twoService.write("我要说的话1"));
	}
}
