package com.hqyj.successInEclipse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerClass 
{
	@ResponseBody
	@RequestMapping("/can")
	public String show()
	{
		return "i  believe  i  can...";
	}
}
