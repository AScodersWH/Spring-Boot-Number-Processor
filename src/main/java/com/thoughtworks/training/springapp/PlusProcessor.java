package com.thoughtworks.training.springapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Profile("plus")
@Component
public class PlusProcessor implements Processor {
    private int plusNumber;
    @Autowired
    public PlusProcessor(@Value("${processor.pluser}") int plusNumber) {
        this.plusNumber = plusNumber;
    }
    @Override
    public List<String> processor(List<String> input) {
        return input.stream().map(Integer::valueOf).map(ellen -> ellen + this.plusNumber)
                .map(String::valueOf).collect(Collectors.toList());
    }
}
