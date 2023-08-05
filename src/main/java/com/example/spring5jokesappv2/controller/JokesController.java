package com.example.spring5jokesappv2.controller;

import com.example.spring5jokesappv2.service.GetJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("/")
@Controller
public class JokesController {

  private final GetJokeService getJokeService;

  public JokesController(GetJokeService getJokeService) {
    this.getJokeService = getJokeService;
  }

  @GetMapping("/")
  public String getJokes(Model model) {
    model.addAttribute("joke", this.getJokeService.getRandomQuote());
    return "index";
  }
}
