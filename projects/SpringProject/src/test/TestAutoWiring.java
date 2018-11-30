package test;

import org.junit.Test;
import org.springframework.core.io.ResourceLoader;

import com.autowiring.service.AutoWiringService;
import com.base.spring.SpringContext;

public class TestAutoWiring {
	
	@Test
	public void test(){
		SpringContext.setSpringXmlPath("classpath:*spring-autowiring.xml");
		AutoWiringService autoWiringService = (AutoWiringService) SpringContext.getInstance().getBean("autoWiringService");
		autoWiringService.say("Hello World ！ ");
	}
}
