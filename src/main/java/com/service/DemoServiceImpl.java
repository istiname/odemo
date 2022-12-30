package com.service;


@Service
@Transactional
public class DemoServiceImpl implements DemoService {


	@Override
	public curryVo getCurrency() {
		curryVo vo = new curryVo();
		try {
			vo.setId();
			vo.setCurrrncy("0");
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemErrorException(e);
		}
		return null;
	}

}
