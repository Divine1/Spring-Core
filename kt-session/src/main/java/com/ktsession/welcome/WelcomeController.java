package com.ktsession.welcome;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class WelcomeController {

	@RequestMapping(value="home",method=RequestMethod.GET)
	public ModelAndView home() {
		System.out.println("in home()");
		return new ModelAndView("welcome");
	}
	
	@RequestMapping(value="away",method=RequestMethod.GET)
	@ResponseBody
	public String away(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("in away()");
		response.setContentType("application/json");
		
		return "from away";
	}
	
	/*@RequestMapping(value="newdata", method = RequestMethod.GET)
	public ModelAndView xyz() {
		return new ModelAndView("new");
	}*/
	@RequestMapping(value="newdata", method = RequestMethod.GET)
	
	public @ResponseBody DemoBean xyz(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("in xyz()");
		String input = request.getParameter("input");
				
		DemoBean demoBean = new DemoBean();
		demoBean.setColor(input);
		//response.setContentType("application/json");
		return demoBean;
	}
	
	@RequestMapping(value="create", method = RequestMethod.POST,consumes = "application/json")
	public @ResponseBody DemoBean postdata(@RequestBody DemoBean bean, HttpServletRequest request,HttpServletResponse response) {
		System.out.println("in postdata()");
		System.out.println("bean "+bean);
		bean.setOutputText("The color is "+bean.getColor());
		return bean;
	}
}
