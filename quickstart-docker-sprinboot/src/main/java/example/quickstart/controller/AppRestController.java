package example.quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppRestController {

    /**
     * 
     * @param accountNo
     * @return Greetig Message
     */
    @GetMapping(value = "/sayHello")
    public String getAccount() {
	return " Hello There ,How are you?";
    }

}
