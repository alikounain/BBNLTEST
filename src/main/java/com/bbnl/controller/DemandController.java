package com.bbnl.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bbnl.entity.Demand;
import com.bbnl.entity.User;
import com.bbnl.repository.UserRepository;
import com.bbnl.service.DemandService;

@Controller
@RequestMapping("/user")
public class DemandController {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private DemandService demandService;
	
	
	@GetMapping("/connection")
	public String connection() {
		return "connections";
	}

	@GetMapping("/connection/addconnection")
	public String newConn(Model model,Principal principal) {
		String username = principal.getName();
		User user = repo.getUserByUserId(username);
		model.addAttribute("user",user);
		model.addAttribute("title", "Add Connection");
		model.addAttribute("demand", new Demand());
		return "newConnection";
	}
	
	@RequestMapping(value = "/saveconn", method = RequestMethod.POST)
	public String saveConn(@ModelAttribute("demand") Demand demand) {
	 demandService.saveDemand(demand);
	 return "redirect:/user/connections?success";
	 }
}
