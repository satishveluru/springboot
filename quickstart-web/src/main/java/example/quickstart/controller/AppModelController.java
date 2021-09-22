package example.quickstart.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import example.quickstart.model.RequestObject;

@Controller
public class AppModelController {

	private static final String WELCOME_REQUEST = "welcome";
	private static final String FORM_FORWARD_REQUEST = "dashboard";

	@GetMapping({"/allrecords","/"})
	public String getDashBoard(Model model) {
		model.addAttribute(WELCOME_REQUEST, new RequestObject());
		return FORM_FORWARD_REQUEST;
	}

	@PostMapping("/newform")
	public String newForm(@ModelAttribute(WELCOME_REQUEST) RequestObject requestObject, Model model) {
		model.addAttribute(WELCOME_REQUEST, requestObject);
		List<String> errors = validateRequestinfo(requestObject);
		// Set<String> errors = validateRequestinfo(requestObject);
		return FORM_FORWARD_REQUEST;
	}
	
	@PostMapping("/validateform")
	public String validateForm(@ModelAttribute(WELCOME_REQUEST) RequestObject requestObject, Model model) {
		model.addAttribute(WELCOME_REQUEST, requestObject);
		List<String> errors = validateRequestinfo(requestObject);
		// Set<String> errors = validateRequestinfo(requestObject);
		return FORM_FORWARD_REQUEST;
	}
	

	private List<String> validateRequestinfo(RequestObject requestObject) {
		return null;
	}

}
