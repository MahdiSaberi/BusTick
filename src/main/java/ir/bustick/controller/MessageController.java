package ir.bustick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/message")
public class MessageController {

    @RequestMapping(method = RequestMethod.GET)
    public String printMessage(ModelMap model){
        return "message";
    }

}
