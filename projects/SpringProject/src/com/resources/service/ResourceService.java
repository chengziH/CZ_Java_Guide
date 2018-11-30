package com.resources.service;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class ResourceService implements ApplicationContextAware{

	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public void resource() throws IOException{
		Resource resource = applicationContext.getResource("url:http://127.0.0.1:40020/mainIndex.htm");
		System.out.println("文件名称:"+resource.getFilename());
		System.out.println("文件长度："+resource.contentLength());// 文件长度
	}
}
