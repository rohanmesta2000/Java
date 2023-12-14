package com.xworkz.com;

import com.xworkz.DTO.MovieDTO;
import com.xworkz.constant.MoviePrice;

public class MovieRunner {
public static void main(String[] args) {
      MovieDTO dto=new MovieDTO(MoviePrice.Kgf);
      System.out.println(MoviePrice.Kgf.getGst());
      
      System.out.println(MoviePrice.Kgf.getPrice());
      
      System.out.println(MoviePrice.Kgf.getDiscount()  );
}
}
