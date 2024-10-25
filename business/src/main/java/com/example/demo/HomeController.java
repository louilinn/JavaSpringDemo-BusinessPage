package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  private static final Home home = new Home(
      "Vi är ett miljövänligt företag som säljer produkter",
      "Vi vill göra världen bättre",
      "Att bli störst på marknaden");

  @GetMapping("/")
  public String getHome(Model model) {
    model.addAttribute("presentation", home.getPresentation());
    model.addAttribute("vision", home.getVision());
    model.addAttribute("goal", home.getGoal());
    return "home";
  }
}
