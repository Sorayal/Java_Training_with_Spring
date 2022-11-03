package form.form_demo.controller;

import form.form_demo.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests and responses
 *
 * version 1.0
 */

@Controller
public class GreetingController {

    // Alternative @RequestMapping

    // HTTP request GET
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        // Key-Value Map between modelName as Key and model instance as value
        model.addAttribute("greeting", new Greeting());
        // leads to the HTML templates under resources, greeting.html
        return "greeting";
    }

    // HTTP request POST
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        // Key-Value Map between modelName as Key and model instance as value
        model.addAttribute("greeting", greeting);
        // leads to the HTML templates under resources, result.html
        System.out.println(greeting);
        return "result";
    }

    @RequestMapping("/cat")
    public String getCatPage(){
        return "cat";
    }
}
