package com.project3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project3.repository.LapTopRepository;

@Service ("lapTopService")
public interface LapTopService {
	
				void deleteLapTop(String serialNumber);
}
