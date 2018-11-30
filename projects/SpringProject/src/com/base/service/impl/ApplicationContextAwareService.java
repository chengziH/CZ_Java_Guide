package com.base.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareService implements ApplicationContextAware{

	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("IOC容器初始化时调用:" + applicationContext.getBean("applicationContextAwareService").hashCode());
	}
	
	public void say(){
		System.out.println("say使用ApplicationContext:" + applicationContext.getBean("applicationContextAwareService").hashCode());
	}
}
