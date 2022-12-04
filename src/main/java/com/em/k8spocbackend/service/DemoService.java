package com.em.k8spocbackend.service;

import com.em.k8spocbackend.model.Demo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DemoService {

  public Demo getDemo() {
    log.info("Requested demo.");
    Demo demo = Demo.builder().title("demo").build();
    log.info("Received demo = {}.", demo);
    return demo;
  }
}
