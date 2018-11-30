package test;

import org.junit.Test;
import com.base.service.impl.BeanScope;
import com.base.spring.SpringContext;

/**
 * Bean scope 测试
 * @author asus
 *
 */
public class BeanScopeTest {
	@Test
	public void test(){
		SpringContext.setSpringXmlPath("classpath*:spring-beanscope.xml");
		BeanScope beanScope1 = (BeanScope) SpringContext.getInstance().getBean("beanScope");
		beanScope1.say();
	}
}
