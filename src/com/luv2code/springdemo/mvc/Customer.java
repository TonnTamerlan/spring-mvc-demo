package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

import lombok.Data;

@Data
public class Customer {

    private String firstName;
    
    @NotNull(message="is required")
    @Size(min=3, message="is required")
    private String lastName;
    
    @NotNull(message="is required")
    @Min(value=0, message="Value must be more or equal than 0")
    @Max(value=10, message="Value must be less or equal then 10")
    //@Pattern(regexp="^[0-9]", message="Required only digits")
    private Integer freePasses;
    
    @Pattern(regexp="^[0-9a-zA-Z]{5}", message="Must be 5 chars/digits")
    private String postalCode;
    
    @CourseCode(value="KOP", message="must start with KOP")
    private String courseCode;
    
}
