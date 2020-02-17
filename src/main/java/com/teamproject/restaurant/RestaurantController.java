package com.teamproject.restaurant;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestaurantController {
	
	@RequestMapping("/restaurant/first_view.do")
	public String first_view() {
		
		return "restaurant/first_view";
	}
	
	@RequestMapping("/restaurant/about.do")
	public String about() {
		
		return "restaurant/about";
	}
	
	@RequestMapping("/restaurant/agent.do")
	public String agent() {
		
		return "restaurant/agent";
	}
	
	@RequestMapping("/restaurant/services.do")
	public String services() {
		
		return "restaurant/services";
	}
	
	@RequestMapping("/restaurant/properties.do")
	public String properties() {
		
		return "restaurant/properties";
	}
	
	@RequestMapping("/restaurant/blog.do")
	public String blog() {
		
		return "restaurant/blog";
	}
	
	@RequestMapping("/restaurant/contact.do")
	public String contact() {
		
		return "restaurant/contact";
	}
	
}
