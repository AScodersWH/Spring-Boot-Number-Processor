package com.thoughtworks.training.springapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Profile("filt")
@Component
public class FilterProcessor implements Processor {
    private int filterNumber;
    @Autowired
    public FilterProcessor(@Value("${processor.filter}") int filterNumber) {
        this.filterNumber = filterNumber;
    }

    @Override
    public List<String> processor(List<String> input) {
        return input.stream().filter(ellen -> Integer.valueOf(ellen) % this.filterNumber != 0)
                .collect(Collectors.toList());
    }
}

