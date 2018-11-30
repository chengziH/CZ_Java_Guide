package test;

import org.junit.Test;

import com.base.service.impl.ApplicationContextAwareService;
import com.base.spring.SpringContext;

public class TestApplicationContextAware {
	
	@Test
	public void test(){
		SpringContext.setSpringXmlPath("classpath:*spring-applicationContext.xml");
		/** 初始化容器 */
		SpringContext.getInstance();
		System.out.println("test1:"+SpringContext.getInstance().getBean("applicationContextAwareService").hashCode());
		System.out.println("test2:"+SpringContext.getInstance().getBean("applicationContextAwareService").hashCode());
		ApplicationContextAwareService applicationContextAwareService = (ApplicationContextAwareService) SpringContext.getInstance().getBean("applicationContextAwareService");
		applicationContextAwareService.say();
	}
}
