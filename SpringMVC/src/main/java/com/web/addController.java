package com.web; 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class addController {
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("t1") String t1,@RequestParam("t2") String t2) {
		
		ModelAndView mv = new ModelAndView();
		
		String result = t1 + t2;
		
		mv.addObject("result",result);
		mv.setViewName("display.jsp");
		
				
		return mv;
	}
}
