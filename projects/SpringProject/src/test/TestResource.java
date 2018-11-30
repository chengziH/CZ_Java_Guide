package test;

import java.io.IOException;

import org.junit.Test;

import com.base.spring.SpringContext;
import com.resources.service.ResourceService;

public class TestResource {
	@Test
	public void test() throws IOException{
		SpringContext.setSpringXmlPath("classpath:*spring-resource.xml");
		ResourceService resourceService = (ResourceService) SpringContext.getInstance().getBean("resourceService");
		resourceService.resource();
	}
}
