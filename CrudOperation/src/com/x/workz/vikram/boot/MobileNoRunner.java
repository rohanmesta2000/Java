package com.x.workz.vikram.boot;

import com.x.workz.vikram.app.MobileNoRepository;
import com.x.workz.vikram.app.MobileNoRepositoryImp;
import com.x.workz.vikram.app.service.MobileNoService;
import com.x.workz.vikram.app.service.MobileNoServiceImp;

public class MobileNoRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in MobileNoRunner");
        MobileNoRepository mobileNoRepository = new MobileNoRepositoryImp();

        MobileNoService mobileNoService = new MobileNoServiceImp();
        boolean ref = mobileNoService.validateAndSave(1234567890L);
        System.out.println(ref);

        boolean ref1 = mobileNoService.validateAndSave(1234567890L);
        System.out.println(ref1);

	}

}
