package com.bbnl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bbnl.entity.ServiceProvider;
import com.bbnl.entity.ServiceType;
import com.bbnl.service.SProviderService;
import com.bbnl.service.ServiceTypeService;

@Controller
public class ServiceProviderController {
	
	@Autowired
	public SProviderService service;
	
	@Autowired
	public ServiceTypeService servicetype;
	
	
	@RequestMapping("/ServiceProviderList")
	public String viewHomePage(Model model) {
		List<ServiceProvider> listServiceProvider = service.listAll();
		model.addAttribute("listServiceProvider",listServiceProvider);
		return "ServiceProviderInfo";
		
	}
	
	    @RequestMapping("/saveServiceProvider")
		public String ShowNewProviderForm(Model model) {
		   
		List<ServiceType> listServiceType = servicetype.listAllService();
		model.addAttribute("listServiceType",listServiceType);
		model.addAttribute("ServiceType", new ServiceType());
		ServiceProvider serviceProvider = new ServiceProvider();
		model.addAttribute("serviceProvider",serviceProvider);
		
		
		return "addServiceProvider";
	
	}
	    
	    
	    @PostMapping("/serviceprovider/save")
	    public String saveServiceProviderDetails(ServiceProvider serviceProvider) {
	    	service.save(serviceProvider);
	    	
	    	return "redirect:/user";
	    }

}
