package com.base.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanNameAwareService implements ApplicationContextAware,BeanNameAware{
	
	private String beanName;
	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
		System.out.println("setBeanName = "+beanName);
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext = "+applicationContext.getBean(beanName));
	}
}
