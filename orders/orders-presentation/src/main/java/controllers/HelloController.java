package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domain.User;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value = "/index", method=RequestMethod.GET)
	public String index(ModelMap model){
		model.addAttribute("message", "Hello Message");
		User user = new User();
		return "home";
	}
}
