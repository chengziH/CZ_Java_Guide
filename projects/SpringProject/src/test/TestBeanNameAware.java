package test;

import org.junit.Test;

import com.base.spring.SpringContext;

public class TestBeanNameAware {
	@Test
	public void test(){
		SpringContext.setSpringXmlPath("classpath:*spring-applicationContext.xml");
		SpringContext.getInstance();// IOC容器初始化时调用setBeanName方法
	}
}
