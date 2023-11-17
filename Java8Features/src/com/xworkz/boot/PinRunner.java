package com.xworkz.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.DTO.PinDTO;

public class PinRunner {
	public static void main(String[] args) {
        System.out.println("Invoking main in PinDTO...");

        PinDTO pin1 = new PinDTO(560001, "Bangalore", "Karnataka", "India");
        PinDTO pin2 = new PinDTO(110001, "New Delhi", "Delhi", "India");
        PinDTO pin3 = new PinDTO(700001, "Kolkata", "West Bengal", "India");
        PinDTO pin4 = new PinDTO(560001, "Bangalore", "Karnataka", "India"); 
        PinDTO pin5 = new PinDTO(411001, "Pune", "Maharashtra", "India");
        PinDTO pin6 = new PinDTO(600001, "Chennai", "Tamil Nadu", "India");
        PinDTO pin7 = new PinDTO(110001, "New Delhi", "Delhi", "India"); 

        Collection<Object> pins = new HashSet<>();
        pins.add(pin1);
        pins.add(pin2);
        pins.add(pin3);
        pins.add(pin4);
        pins.add(pin5);
        pins.add(pin6);
        pins.add(pin7);

        System.out.println("Total pins: " + pins.size());
        System.out.println(pins.stream().filter(pin -> pin instanceof PinDTO)
                .map(pin -> ((PinDTO) pin).getPinCode()).collect(Collectors.toSet()).size());
    }
}

