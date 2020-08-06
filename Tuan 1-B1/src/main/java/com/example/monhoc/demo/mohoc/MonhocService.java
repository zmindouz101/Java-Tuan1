package com.example.monhoc.demo.mohoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonhocService {

	@Autowired
	MonhocRepository mhRepository;

	
	public Optional<Monhoc> getMonhoc(String mamh) {
		return mhRepository.findById(mamh);
	}

	public void updateMonhoc(String mamh, Monhoc mh) {
		mh.setMamh(mamh);
		mhRepository.save(mh);
	}

	public void createMonhoc(String mamh, Monhoc mh) {
		mh.setMamh(mamh);
		mhRepository.save(mh);
	}

	public List<Monhoc> getAllmonhoc() {
		List<Monhoc> monhocs = new ArrayList<Monhoc>();
		mhRepository.findAll().forEach(monhocs::add);
		return monhocs;
	}
}
