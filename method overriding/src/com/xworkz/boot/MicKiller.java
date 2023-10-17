package com.xworkz.boot;

import com.xworkz.app.DynamicMic;
import com.xworkz.app.Mic;

public class MicKiller {

	public static void main(String[] args) {
		System.out.println("invoking in main method");
		Mic mic=new DynamicMic();
			mic.sound();
			}


	}


