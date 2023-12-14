package com.x.workz.vikram.app;

public class PinCodeImpl implements PinCode {
	private int[] codes = new int[Total_Code];
	private int position;

	@Override
	public void save(int pincode) {
		System.out.println("pincode is very neceesity to deleiver");
		if (this.position < Total_Code) {
			this.codes[position] = pincode;
			System.out.println("Pincode added" + pincode + "at position" + this.position);
			this.position++;
		} else {
			System.err.println("PINCODE NOT FOUND");
		}
	}

	@Override
	public boolean isExist(int pincode) {
		for (int start = 0; start < this.position; start++) {
			int temp = this.codes[start];
			if (temp== pincode) {
				System.err.println("pincode already exist");
				return  true;
			}
		}
		return false;
	}

}
