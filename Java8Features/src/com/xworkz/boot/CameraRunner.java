package com.xworkz.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.DTO.CameraDTO;

public class CameraRunner {

	public static void main(String[] args) {
		System.out.println("running in main method");
		CameraDTO camera = new CameraDTO(1, "Nikon ", "EOS 3000D", 35996, LocalDate.of(2023, 11, 6));
		CameraDTO camera1 = new CameraDTO(2, "Sony", "Alpha ZV-E10L", 61522, LocalDate.of(2023, 12, 6));
		CameraDTO camera2 = new CameraDTO(3, "Kodak", "Alpha ILCE-7M4", 218489, LocalDate.of(2023, 5, 15));
		CameraDTO camera3 = new CameraDTO(4, "Canon", "EOS 200D", 57824, LocalDate.of(2022, 12, 20));
		CameraDTO camera4 = new CameraDTO(5, "Panasonic", "EOS M50", 57809, LocalDate.of(2022, 6, 12));

		Collection<CameraDTO> ref = new ArrayList<CameraDTO>();
		ref.add(camera);
		ref.add(camera1);
		ref.add(camera2);
		ref.add(camera3);
		ref.add(camera4);

		System.out.println("total number of camera " + ref.size());

		ref.stream().filter(came -> came.getBrand().equals("Canon"))
				.forEach(cams -> System.out.println("Brand;" + cams.getBrand()));

		Collection<String> models = new ArrayList<String>();

		ref.stream().filter(c -> c.getBrand().equals("Canon")).forEach(c -> models.add(c.getModel()));
		models.forEach(s -> System.out.println(s));

		ref.stream().filter(came -> came.getBrand().equals("Sony")).map(cam2 -> cam2.getCost())
				.forEach(n -> System.out.println(n));

	}

}
