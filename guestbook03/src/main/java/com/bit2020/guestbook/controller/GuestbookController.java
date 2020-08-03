package com.bit2020.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit2020.guestbook.repository.GuestbookRepository;
import com.bit2020.guestbook.vo.GuestbookVo;

@Controller
public class GuestbookController {
	
	@Autowired
	GuestbookRepository guestbookRepository;
	
	@RequestMapping("")
	public String index(Model model) {
		List<GuestbookVo> list = guestbookRepository.findAll();
		model.addAttribute("list",list);
		return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(GuestbookVo vo) {
		guestbookRepository.insert(vo);
		return "redirect:/";
	}
	@RequestMapping("/deleteform/{no}")
	public String deleteform(Model model, @PathVariable("no")Long no) {
		model.addAttribute("no",no);
		return "/WEB-INF/views/deleteform.jsp";
	}
	@RequestMapping(value ="/delete", method=RequestMethod.POST)
	public String delete(Long no, String password) {
		guestbookRepository.delete(no, password);
		return "redirect:/";
	}
}
