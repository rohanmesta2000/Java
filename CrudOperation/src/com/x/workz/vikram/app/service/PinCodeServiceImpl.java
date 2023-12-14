package com.x.workz.vikram.app.service;

import com.x.workz.vikram.app.PinCode;

public class PinCodeServiceImpl implements PinCodeService {
	private PinCode pincode;

	public PinCodeServiceImpl(PinCode pinCode) {
		this.pincode = pinCode;
	}

	@Override
	public boolean ValidAndSave(int pincode) {
		System.out.println("invoking in validAndSave in PinCode impl");
		if(pincode >=500000 && pincode <=1000000) {
			System.out.println("pincodee is valif then store in post"+this.getClass().getSimpleName());
			if(!this.pincode.isExist(pincode)) {
				this.pincode.save(pincode);
				return true;
			}
			else {
				System.err.println("pincode"+pincode+"is already exist,please enter another");
			}
		}
		else{
			System.err.println("cannot store the pincode");
		}
		
		return false;
	}
}
