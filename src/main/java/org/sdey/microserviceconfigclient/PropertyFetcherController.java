package org.sdey.microserviceconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PropertyFetcherController {

	@Value("${game}")
	private String game;
	
	@Value("${version}")
	private String version;
	
	@GetMapping
	public String getProperties(Model m) {
		
		m.addAttribute("game", game);
		m.addAttribute("version", version);
		
		return "properties";
	}
}
