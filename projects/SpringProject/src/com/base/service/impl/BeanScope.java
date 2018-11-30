package com.base.service.impl;

public class BeanScope{
	/** 初始化 */
	public void init() {
		System.out.println("IOC容器初始化Bean时，调用该init方法！");
		// 需初始化的一些业务逻辑代码
	}
	
	
	public void say(){
		//  this.hashCode() 来区分调用say方法的实例，如果hashCode相同，那么是同一个实例
		System.out.println("BeanScope Say : " + this.hashCode());
	}
}
