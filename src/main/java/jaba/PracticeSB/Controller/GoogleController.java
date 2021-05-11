package jaba.PracticeSB.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoogleController {
    @RequestMapping("/google")
    public String googleRedir(@RequestParam(name = "q") String query){
        return "redirect://www.google.com/search?q=" + query;
    }
}
