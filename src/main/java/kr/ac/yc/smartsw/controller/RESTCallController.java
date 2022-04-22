package kr.ac.yc.smartsw.controller;

import java.io.IOException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import kr.ac.yc.smartsw.service.RESTService;

@Controller
public class RESTCallController {

	private static final Logger logger = LoggerFactory.getLogger(RESTCallController.class);
	
	@Autowired
	RESTService restService;
	
	@GetMapping({"/rest/{id}", "/rest"})
	public String test(@PathVariable Optional<Long> id) {
		String url = "http://localhost:8000/test/";
		
		try {
			restService.restGet(url + id.orElse(1L) + "/");
			return "index";
		} catch (IOException e) {
			logger.debug("imageService failed");
			e.printStackTrace();
			return "index";
		}
	}
	
}
