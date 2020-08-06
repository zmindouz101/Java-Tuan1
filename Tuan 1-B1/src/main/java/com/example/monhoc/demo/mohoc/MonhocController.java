package com.example.monhoc.demo.mohoc;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonhocController {

	@Autowired
	MonhocService mhService;

	@RequestMapping(method = RequestMethod.GET, value = "/monhoc/{mamh}")
	public Optional<Monhoc> getmonhocInfo(@PathVariable String mamh) {
		return mhService.getMonhoc(mamh);
	}

	@RequestMapping(value = "/monhoc/{mamh}", method = RequestMethod.PUT)
	public void updatemonhoc(@PathVariable String mamh, @RequestBody Monhoc mh) {
		mhService.updateMonhoc(mamh, mh);
	}

	@RequestMapping(value = "/monhoc/{mamh}", method = RequestMethod.POST)
	public void createmonhoc(@PathVariable String mamh, @RequestBody Monhoc mh) {
		mhService.createMonhoc(mamh, mh);
	}

	@RequestMapping(value = "/monhoc", method = RequestMethod.GET)
	public List<Monhoc> getAllmonhoc() {
		return mhService.getAllmonhoc();
	}
}
