package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class EventController {

@GetMapping("/create-event")
    public String renderEventForm() {
    return "event-form";
}

@PostMapping("/create-new-event")
    @ResponseBody
    public String creaeteNewEvent(@RequestParam("title")String title){
    System.out.println(title);
    return "redirect:/success";
}



}
