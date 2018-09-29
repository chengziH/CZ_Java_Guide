package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.base.service.OneService;

/**
 * 测试生成ApplicationContext的方式
 * @author asus
 *
 */
@RunWith(JUnit4.class)
public class TestCreateApplicationContext {
	@Test
	public void create1(){
		/** 第一种：指定本地路径的配置文件 */
		FileSystemXmlApplicationContext fileContext = new FileSystemXmlApplicationContext("D://spring-ioc.xml");
		fileContext.start();
		OneService oneServiceFile = fileContext.getBean(OneService.class);
		System.out.println(oneServiceFile.say("指定本地路径的配置文件"));
		fileContext.destroy();
	}
	@Test
	public void create2(){
		/** 第二种：指定项目的相对路径ClassPath */
		ClassPathXmlApplicationContext classContext = new ClassPathXmlApplicationContext("classpath*:spring-ioc.xml");
		classContext.start();
		OneService oneServiceClass = classContext.getBean(OneService.class);
		System.out.println(oneServiceClass.say("指定项目的相对路径ClassPath"));
		classContext.destroy();
	}
}
