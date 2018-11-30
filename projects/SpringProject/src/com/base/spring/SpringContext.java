package com.base.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringContext {
	
	/** Spring上下文容器 */
	private static ClassPathXmlApplicationContext context;
	/** Spring配置文件地址，即spring-ioc.xml地址 */
	private static String springXmlPath;

	public static void setSpringXmlPath(String springXmlPath) {
		SpringContext.springXmlPath = springXmlPath;
	}

	public static ClassPathXmlApplicationContext getInstance(){
		if(context != null){
			return context;
		}else {
			initContext();
			return context;
		}
	}
	
	private static void initContext(){
		System.out.print("初始化Spring Context");
		if(springXmlPath == null || springXmlPath == ""){
			springXmlPath = "classpath*:spring-ioc.xml";
		}
		try {
			context = new ClassPathXmlApplicationContext(springXmlPath);
			context.start();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
	
	public void destroy(){
		context.destroy();
	}
	
	/** 常用方式一：获取bean对象 */
	@SuppressWarnings("unchecked")
	public <T extends Object> T getBean(String beanName){
		return (T) context.getBean(beanName);
	}
	/** 常用方式二：获取bean对象 */
	public <T extends Object> T getBean(Class<T> clazz){
		return context.getBean(clazz);
	}
}
