package com.springAss.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan (basePackages = ("com.springAss.main.controller, com.springAss.main.service"))
public class AssServletConfig implements WebMvcConfigurer{

}
