package com.xworkz.application.service;

import com.xworkz.application.app.dto.ApplicationDto;
import com.xworkz.application.repository.ApplicationRepository;

public class ApplicationServiceImpl implements ApplicationService {
	private ApplicationRepository applicationRepository;

	public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
		this.applicationRepository = applicationRepository;
	}

	@Override
	public boolean validateAndSave(ApplicationDto dto) {
		System.out.println("invoking in validateAndSave");

		if (dto != null) {
			System.out.println("dto is valid,then store application details" + this.getClass().getSimpleName());
			int id=dto.getId();
			String name=dto.getName();
			String developedBy=dto.getDevolpedBy();
			String developedAt=dto.getDevolpedAt();
			String version=dto.getVersion();
			
			if(id>0) {
				
System.out.println("Application is valid");
				
			}else {
				System.out.println("Application is invalid");
			}
			if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=10) {
				System.out.println("Application"+dto.getName()+"is valid");
			}
			else {
				System.err.println("Application"+dto.getName()+"is invalid");
			}
			if(developedBy!=null && !developedBy.isEmpty() && developedBy.length()>=10 && developedBy.length()<=50) {
				System.out.println("developedBy"+dto.getName()+"is valid");
			}
			else {
				System.err.println("developedBy"+dto.getName()+"is invalid");	
			}
			if(developedAt!=null && !developedAt.isEmpty() && developedAt.length()>=10 && developedAt.length()<=50) {
				System.out.println("developedAt"+dto.getName()+"is valid");
			}
			else {
				System.err.println("developedAt"+dto.getName()+"is invalid");	
			}
			if(version!=null && !version.isEmpty() && version.length()>=10 && version.length()<=50) {
				System.out.println("version"+dto.getName()+"is valid");
			}
			else {
				System.err.println("version"+dto.getName()+"is invalid");	
			}
			this.applicationRepository.save(dto);
			return true;
		}
		return false;
	}

}
