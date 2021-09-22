package example.quickstart.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

public abstract class AbstractController {
	
	@ModelAttribute
	public void addModelFields(Model model) {
		model.addAttribute("test","test");
		
	}

}
