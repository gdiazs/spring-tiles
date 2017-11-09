package io.gdiazs.example.home.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.gdiazs.example.home.view.HomeView;

@Service
public class HomeServiceDefault implements HomeService{


	@Transactional(readOnly = true)
	public HomeView getHomeView() {
		HomeView homeView = new HomeView();
		homeView.setWelcomeMessage("Hola tres");
		
		return homeView;
	}

}
