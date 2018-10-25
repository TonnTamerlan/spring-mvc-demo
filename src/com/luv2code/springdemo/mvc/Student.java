package com.luv2code.springdemo.mvc;

import java.util.HashMap;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Student {
    
    private String firstName;

    private String lastName;
    
    private String country;
    
    private String programLanguage;

    private String[] operatingSystems;
    
    private HashMap<String, String> countryOptions;
    
    public Student() {
        countryOptions = new HashMap<>(5);
        countryOptions.put("UKR", "Ukraine");
        countryOptions.put("RUS", "Russia");
        countryOptions.put("POL", "Poland");
        countryOptions.put("BEL", "Belarussia");
        countryOptions.put("UZB", "Uzbekistan");
    }

}
