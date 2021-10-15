package com.azael.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("goHello")
	public ModelAndView redirectTo() {
		ModelAndView MV = new ModelAndView();
		MV.setViewName("hello");
		MV.addObject("message", "Mensaje desde un controlador git Hub!");
		return MV;
	}
	
}
