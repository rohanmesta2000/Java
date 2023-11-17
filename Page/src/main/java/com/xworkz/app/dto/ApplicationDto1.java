package com.xworkz.app.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ApplicationDto1 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 11, 04);
		LocalDate date1 = LocalDate.of(2023, 11, 06);

		ApplicationDto applicationDto = new ApplicationDto("Whatsapp", "9powee", "xiami", LocalDate.of(2023, 12, 6),
				03.1);
		ApplicationDto applicationDto1 = new ApplicationDto("snap", "9poweer", "iami", LocalDate.of(2013, 12, 7), 13.1);
		ApplicationDto applicationDto2 = new ApplicationDto("Wpp", "9powee", "xiami", LocalDate.of(2012, 12, 6), 03.1);
		ApplicationDto applicationDto3 = new ApplicationDto("sapp", "9powee", "xiami", LocalDate.of(2022, 12, 6), 03.1);
		ApplicationDto applicationDto4 = new ApplicationDto("tsapp", "9powee", "xiami", LocalDate.of(2021, 12, 6),
				03.1);

		Collection<ApplicationDto> application = new ArrayList();
		application.add(applicationDto);
		application.add(applicationDto1);
		application.add(applicationDto2);
		application.add(applicationDto3);
		application.add(applicationDto4);

		Iterator<ApplicationDto> itr = application.iterator();
		while (itr.hasNext()) {
			ApplicationDto applicationDto11 = itr.next();
			System.out.println(applicationDto11.getName());
		}

	}

}
