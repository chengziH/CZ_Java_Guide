package com.base.service.impl;

import com.base.service.TwoService;

public class TwoServiceImpl implements TwoService{
	@Override
	public String write(String content) {
		return "你在写什么,"+content;
	}
}
