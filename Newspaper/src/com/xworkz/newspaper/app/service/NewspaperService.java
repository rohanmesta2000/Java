package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.NewspaperDTO;

public interface NewspaperService {
 boolean validateAndSave(NewspaperDTO dto);
}
