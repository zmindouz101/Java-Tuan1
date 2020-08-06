package com.example.monhoc.demo.mohoc;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.CrudRepository;



@EnableAutoConfiguration
public interface MonhocRepository extends CrudRepository<Monhoc, String> {
	List<Monhoc> findByName(String tenmh);
	

}
