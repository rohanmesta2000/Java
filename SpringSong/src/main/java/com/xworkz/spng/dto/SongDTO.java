package com.xworkz.spng.dto;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SongDTO {
	@NotNull()
	@Size(min = 3, max = 100, message = " name should be between 3 to 10")
	private String name;
	@NotNull()
	@Size(min = 3, max = 10, message = " singer name should be between 3 to 10")
	private String singer;
	@NotNull()
	@Size(min = 3, max = 10, message = "composer name should be between 3 to 10")
	private String composer;
	@DecimalMin("1")
	@DecimalMax("60")
	private double duration;
	@NotNull()
	@Size(min = 3, max = 100, message = " albumtype should be between 3 to 10")
	private String albumType;
	@NotNull()
	@Size(min = 3, max = 100, message = " language should be between 3 to 100")
	private String language;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate releaseDate;
	@NotNull()
	@Size(min = 3, max = 100, message = " lyrist should be between 3 to 100")
	private String lyricist;
	@NotNull()
	@Size(min = 3, max = 20, message = " producer should be between 3 to 20")
	private String producer;
	@NotNull()
	@Size(min = 3, max = 30, message = " director should be between 3 to 10")
	private String director;
//	@NumberFormat(pattern = "#")  
//	private long mobileNumber;

}
