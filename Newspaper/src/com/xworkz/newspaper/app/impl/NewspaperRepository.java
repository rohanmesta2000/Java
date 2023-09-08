package com.xworkz.newspaper.app.impl;

import com.xworkz.newspaper.app.dto.NewspaperDTO;

public interface NewspaperRepository {
	int TOTAL_PAPERS = 10;

    void save(NewspaperDTO dto);
}
