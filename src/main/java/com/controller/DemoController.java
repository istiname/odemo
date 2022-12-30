package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.service.DemoService;
import com.vo.curryVo;

@RestController
@RequestMapping(value = "/api/demo")
public class DemoController {
	private final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

	@Autowired
	DemoService demoService;

	@ApiOperation(value = "取得Currency", notes = "")
	@RequestMapping(value = "/getUser", method = RequestMethod.POST)
	public curryVo getCurrrncy() {
		LOGGER.debug("strart getCurrrncy");
		curryVo vo = demoService.curryVo();
		LOGGER.debug("getCurrrncy complete");
		return vo;
	}


	@ApiOperation(value = "更新Currency", notes = "")
	@RequestMapping(value = "/updateUser", method = RequestMethod.put)
	public curryVo updateCurrrncy(curryVo vo ) {
		LOGGER.debug("strart updateCurrrncy");
		curryVo vo = demoService.updateCurrency(vo);
		LOGGER.debug("updateCurrrncy complete");
		return vo;
	}
	
	@ApiOperation(value = "刪除Currency", notes = "")
	@RequestMapping(value = "/deleteUser", method = RequestMethod.delete)
	public curryVo deleteCurrency(String currency) {
		LOGGER.debug("strart deleteCurrency");
		demoService.deleteCurrency(currency);
		LOGGER.debug("deleteCurrency complete");
		return vo;
	}
	
}
