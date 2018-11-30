package com.base.service.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * bean的生命周期
 * @author asus
 *
 */
public class BeanLifeCycle implements InitializingBean,DisposableBean{
	public void defaultInit(){
		System.out.println("IOC容器初始化beanLifeCycle bean时，调用该defaultInit方法");
	}
	public void defaultClose(){
		System.out.println("IOC容器销毁bean时，调用该defaultClose方法");
	}
	
//	public void init(){
//		System.out.println("IOC容器初始化beanLifeCycle bean时，调用该init方法");
//	}
//	public void close(){
//		System.out.println("IOC容器销毁bean时，调用该close方法");
//	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("IOC容器销毁bean时，调用该destroy方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("IOC容器初始化beanLifeCycle bean时，调用该afterPropertiesSet方法");
	}
}
