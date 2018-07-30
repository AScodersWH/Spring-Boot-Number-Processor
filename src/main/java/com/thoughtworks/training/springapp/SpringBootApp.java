package com.thoughtworks.training.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class SpringBootApp implements ApplicationRunner {

    private final App app;

    @Autowired
    public SpringBootApp(App app) {
        this.app = app;
    }

    @Override
    public void run(ApplicationArguments args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(app.generateArray(scanner.nextLine()));

    }
}
