package com.xworkz.spring.dto;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CakeDTO {
	@NotNull
	@Size(min = 1,max = 10,message = "name should be more than 5")
private String customer;
	@Email
private String email;
	@NotNull
	@Size(min = 5,max = 10 ,message = "flavour should be more than 100")
private String flavour;
	@NotNull
	@Size(min = 3 ,max = 1000,message = "weight should be more than 100")
private String weight;
	@DecimalMin("10")
	@DecimalMax("1000")
private String price;
private boolean takeaway;

}
