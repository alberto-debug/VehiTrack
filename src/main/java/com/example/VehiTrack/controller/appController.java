package com.example.VehiTrack.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {

  @PostMapping("/")
  public String hello() {
    return ("HELLO, KINDLY NOTE THAT YOUR APPLICATION IS LIVE");
  }

}
