package kr.ac.yc.smartsw.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
@RequestMapping("/home")
public class HomeController {
	private static Logger LOGGER = LogManager.getLogger();
	
	String time;

    @GetMapping
    public String index(Model models) {
    	LOGGER.debug("call index.");

//        models.addAttribute(time, homeService.getStringCurrentDateTime());

        return "index";
    }
}
