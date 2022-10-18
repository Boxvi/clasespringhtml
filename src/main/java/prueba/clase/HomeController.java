package prueba.clase;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String home(){
        return "redirect:https://futbollatam.com/esp/?home";
    }
    /*
    @GetMapping("/")
    public String home(){
        return "redirect:/app/index";
    }*/
}
