//package test;
//
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.runner.RunWith;
//import org.junit.runners.BlockJUnit4ClassRunner;
//import org.springframework.beans.BeansException;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//@RunWith(BlockJUnit4ClassRunner.class)
//public class SpringUnitTestBase {
//	/** Spring上下文容器 */
//	private static ClassPathXmlApplicationContext context;
//	/** Spring配置文件地址，即spring-ioc.xml地址 */
//	private static String springXmlPath;
//	public SpringUnitTestBase(){}
//	public SpringUnitTestBase(String springXmlPath){
//		this.springXmlPath = springXmlPath;
//	}
//	/** 创建Spring上下文对象 */
//	@BeforeClass
//	public static void before()  {
//		if(springXmlPath == null || springXmlPath == ""){
//			springXmlPath = "classpath*:spring-*.xml";
//		}
//		try {
//			context = new ClassPathXmlApplicationContext(springXmlPath);
//			context.start();
//		} catch (BeansException e) {
//			e.printStackTrace();
//		}
//	}
//	/** Spring上下文摧毁 */
//	@AfterClass
//	public static void after(){
//		context.destroy();
//	}
//	/** 常用方式一：获取bean对象 */
//	@SuppressWarnings("unchecked")
//	public <T extends Object> T getBean(String beanName){
//		return (T) context.getBean(beanName);
//	}
//	/** 常用方式二：获取bean对象 */
//	public <T extends Object> T getBean(Class<T> clazz){
//		return context.getBean(clazz);
//	}
//}
