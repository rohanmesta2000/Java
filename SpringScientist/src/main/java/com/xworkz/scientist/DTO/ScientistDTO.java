package com.xworkz.scientist.DTO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ScientistDTO {

	@NotNull()
	@Size(min = 3, max = 10, message = " name should be betwwen 3 to 10")
	private String name;
	@NotNull()
	@Size(min = 3, max = 20, message = " field should be betwwen 3 to 10")
	private String field;
	@Min(1)
	@Max(15)
	private int exp;

	@NotNull()
	@Size(min = 3, max = 10, message = " country should be betwwen 3 to 10")
	private String country;

	@NotNull()
	@Size(min = 3, max = 10, message = "achievement should be betwwen 3 to 10")
	private String achivement;

}
