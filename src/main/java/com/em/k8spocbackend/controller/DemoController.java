package com.em.k8spocbackend.controller;

import com.em.k8spocbackend.model.Demo;
import com.em.k8spocbackend.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class DemoController {

  private final DemoService demoService;

  @GetMapping("/demo")
  public Demo getDemo() {
    return demoService.getDemo();
  }
}
