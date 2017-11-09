package io.gdiazs.example.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.gdiazs.example.home.service.HomeService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	
	private HomeService homeService;
	
	@Autowired
	public HomeController(HomeService homeService) {
		this.homeService = homeService;
	}
	

	@GetMapping
	public String index(Model model){
		
		model.addAttribute("homeView", this.homeService.getHomeView());
		
		return "homeIndex";
	}
}
