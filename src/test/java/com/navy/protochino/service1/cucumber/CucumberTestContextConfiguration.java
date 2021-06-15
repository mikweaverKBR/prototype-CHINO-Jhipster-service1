package com.navy.protochino.service1.cucumber;

import com.navy.protochino.service1.ProtoChinoServiceOneApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = ProtoChinoServiceOneApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
