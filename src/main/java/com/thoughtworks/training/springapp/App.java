package com.thoughtworks.training.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
@Component
public class App {
    private List<Processor> processorList;
    @Autowired
    public App(List<Processor> processors){
        this.processorList = processors;
    }

    public String generateArray(String input) {
        List<String> processes = Arrays.asList(input.split(" "));
        for (Processor pro : processorList) {
            processes = pro.processor(processes);
        }
        return String.join(" ",processes);
    }
}
