package com.x.workz.vikram.app.service;

import com.x.workz.vikram.app.TrainNo;

public class TrainNoServiceImps implements TrainNoService {
   private TrainNo trainNo;
   public TrainNoServiceImps(TrainNo trainNo) {
	   this.trainNo=trainNo;
   }
   
	@Override
	public boolean ValidAndSave(int traincode) {
		System.out.println("invoking in validAndSave in TrainCode impl");
		if(traincode >=5000 && traincode <=10000) {
			System.out.println("traincode is valid then store in post"+this.getClass().getSimpleName());
			if(!this.trainNo.isExist(traincode)) {
				this.trainNo.save(traincode);
				return true;
			}
			else {
				System.err.println("traincode"+traincode+"is already exist,please enter another");
			}
			
		}
		else{
			System.err.println("cannot store the traincode");
		}
		return false;
	}

}
