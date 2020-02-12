package com.alurie.resttest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping("/test")
  public String test() {
    System.out.println("here");
    return "Hello";
  }

  @PostMapping("/test")
  public String test(@RequestBody String req) {
    System.out.println("here");
    return "OK";
  }
}
