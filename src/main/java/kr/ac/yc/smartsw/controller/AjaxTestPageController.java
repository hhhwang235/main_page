package kr.ac.yc.smartsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajax/view")
public class AjaxTestPageController {
	
	@GetMapping
	public String viewPage() {
		return "ajaxTestPage";
	}

}
