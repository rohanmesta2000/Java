package com.x.workz.vikram.boot;

import com.x.workz.vikram.app.TrainNo;
import com.x.workz.vikram.app.TrainNoImps;
import com.x.workz.vikram.app.service.TrainNoService;
import com.x.workz.vikram.app.service.TrainNoServiceImps;

public class TrainNoRunner {

	public static void main(String[] args) {
		System.out.println("invoking in TrainNoRunner");
		TrainNo trainNo=new TrainNoImps();
		TrainNoService trainNoService=new TrainNoServiceImps(trainNo);
		trainNoService.ValidAndSave(8399);
		trainNoService.ValidAndSave(8399);
		
		

	}

}
