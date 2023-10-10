package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String home(
            Model model,
            @RequestParam("nome") String pNome) {
        model.addAttribute("nome", pNome);
        return "home";
    }
}