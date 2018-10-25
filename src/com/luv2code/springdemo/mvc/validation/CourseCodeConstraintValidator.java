package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

    private String coursePrefix;
    
    @Override
    public void initialize(CourseCode courseCode) {
        ConstraintValidator.super.initialize(courseCode);
        
        this.coursePrefix = courseCode.value();
        
    }
    
    @Override
    public boolean isValid(String code, ConstraintValidatorContext validator) {

        
        return code == null ? false : code.startsWith(coursePrefix);
    }

}
