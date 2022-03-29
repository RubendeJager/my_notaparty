package be.thomasmore.notaparty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Value("${specialnumber:222}")
    private int specialNumber;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("specialNumber", specialNumber);
        return "home";
    }
}
