package com.thoughtworks.training.springapp;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface Processor {
   public List<String> processor(List<String> input);
}
