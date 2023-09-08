package com.xworkz.newspaper.app.impl;

import com.xworkz.newspaper.app.dto.PrinterDTO;

public interface PrinterRepository {
int TOTAL_COPIES=10;

void save(PrinterDTO dto);
}
