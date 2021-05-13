package com.exmaple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.jdbc.MyUserDAO;

@Controller
public class MyController {
	
	@Autowired
	private MyUserDAO userDAO;
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "MyBatis 사용하기";
	}
	
	@RequestMapping(value = "/User", method = RequestMethod.GET)
	public String userlistPage(Model model) {
		model.addAttribute("users",userDAO.list());
			return "userlist";
		
			
	}
}
