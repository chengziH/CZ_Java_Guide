package com.base.service.impl;

import com.base.service.OneService;
import com.base.service.TwoService;

public class OneServiceImpl implements OneService{
	private TwoService twoService;
	public OneServiceImpl(TwoService twoService){
		this.twoService = twoService;
	}
	@Override
	public String say(String sayContent) {
		return "要说的内容是 = " + sayContent + " ------ " + twoService.write(sayContent);
	}
}
