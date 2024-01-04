package com.xworkz.spring.dto;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class EngineDTO {
@NotNull
@Size(min=3,max=30,message="Name should be between 3-30 characters")
private String name;
@NotNull
@Size(min=3,max=30,message="company should be between 3-30 characters")
private String company;
@Min(1000)
@Max(6000)
private int price;
@DecimalMin("50.00")
@DecimalMax("150.00")
private  double weight;
@NotNull
@Size(min=3,max=30,message="ModelNo shoulfd be between 3-30 characters")
private String modelNo;
}
