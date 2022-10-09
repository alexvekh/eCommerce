package com.boocrun.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {
	@RequestMapping(value="/dashboard", method=RequestMethod.GET)
	public String dasboardGet (ModelMap model)
	{
		return "dashboard";
	}
	
	
	
}
