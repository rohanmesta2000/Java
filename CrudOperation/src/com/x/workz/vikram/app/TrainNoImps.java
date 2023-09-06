package com.x.workz.vikram.app;

public class TrainNoImps implements TrainNo {
	private int[] codes = new int[Total_Code];
	private int position;
	
	@Override
	public void save(int traincode) {
		System.out.println("trainning code is valid");
		if (this.position < Total_Code) {
			this.codes[position] = traincode;
			System.out.println("Traincode added" + traincode + "at position" + this.position);
			this.position++;
		} else {
			System.err.println("TRAINCODE NOT FOUND");
		}
		
	}
	@Override
	public boolean isExist(int traincode) {
		for (int start = 0; start < this.position; start++) {
			int temp = this.codes[start];
			if (temp== traincode) {
				System.err.println("traincode already exist");
				return  true;
			}
		}
		
		return false;
	}

}
