package jaba.PracticeSB.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DuckduckgoController {
    @RequestMapping("/duck")
    public String googleRedir(@RequestParam(name = "q") String query){
        return "redirect://www.duckduckgo.com/?q=" + query;
    }
}
