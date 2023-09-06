package com.x.workz.vikram.boot;

import com.x.workz.vikram.app.PinCode;
import com.x.workz.vikram.app.PinCodeImpl;
import com.x.workz.vikram.app.service.PinCodeService;
import com.x.workz.vikram.app.service.PinCodeServiceImpl;

public class PinCodeRunner {

	public static void main(String[] args) {
		System.out.println("invoking in runner ");
		PinCode pinCode=new PinCodeImpl();
		PinCodeService pinCodeService=new PinCodeServiceImpl(pinCode);
		
		pinCodeService.ValidAndSave(581334);
		pinCodeService.ValidAndSave(581334);
		

	}

}
