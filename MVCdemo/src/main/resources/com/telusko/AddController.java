package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class AddController {
	
	@RequestMapping("/add")
	public String add() {
	//	System.err.println("i am here");
		return "display.jsp";
	}
}
