package test;

import org.junit.Test;
import com.base.service.impl.BeanLifeCycle;
import com.base.spring.SpringContext;
public class BeanLifeCycleTest {
	@Test
	public void test(){
		SpringContext.setSpringXmlPath("classpath:*spring-lifecycle.xml");
		SpringContext.getInstance();
//		BeanLifeCycle beanLifeCycle = (BeanLifeCycle) SpringContext.getInstance().getBean("beanLifeCycle");
		SpringContext.getInstance().destroy();
	}

}
