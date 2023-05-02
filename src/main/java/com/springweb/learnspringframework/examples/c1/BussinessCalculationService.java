package com.springweb.learnspringframework.examples.c1;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BussinessCalculationService {

    private IDataService dataService;

    public BussinessCalculationService(IDataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
