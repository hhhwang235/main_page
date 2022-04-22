package kr.ac.yc.smartsw.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.yc.smartsw.dto.AjaxDTO;

@RestController
@RequestMapping("/ajax")
public class AjaxController {
	private static Logger LOGGER = LogManager.getLogger();
	
	@GetMapping
	public String viewPage(
//			@RequestBody AjaxDTO param
			) {
//		LOGGER.debug("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐︎ajax get request " + param.getArgs1() + ", " +param.getArgs2());
		LOGGER.debug("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐︎ajax get request");
		return "ajaxTestPage";
	}
	
	@PostMapping
	public String returnAjax(@RequestBody AjaxDTO param) {
		LOGGER.debug("★★★★★★★★★★★ajax post response " + param.getArgs1() + ", " +param.getArgs2());
		return "받은 데이터 : " + param.getArgs1() + ", " +param.getArgs2();
	}
}
