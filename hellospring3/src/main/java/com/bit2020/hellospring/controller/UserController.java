package com.bit2020.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(UserVo vo) {
		System.out.println(vo);
		
		return "redirect:/";
	}
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String update(@RequestParam("n") String name) {
		System.out.println("name : " + name);
		return "UserConroller:update";
	}
	
	
	
	@ResponseBody
	@RequestMapping(value="/update2")
	public String update2(
			@RequestParam(value="n" ,required=true, defaultValue="")String name,
			@RequestParam(value="n" ,required=true, defaultValue="0")int age) {
		
		return "UserConroller:update";
	}
	
}
