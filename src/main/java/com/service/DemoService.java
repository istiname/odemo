package com.service;

import com.vo.curryVo;

public interface DemoService {

	curryVo getCurrency();

	curryVo updateCurrency(curryVo vo);
	
	void deleteCurrency(String currency);

}