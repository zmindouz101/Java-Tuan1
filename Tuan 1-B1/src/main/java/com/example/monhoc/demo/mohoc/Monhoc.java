package com.example.monhoc.demo.mohoc;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
@EnableAutoConfiguration
public class Monhoc {
	@Id
	private String mamh;

	private String tenmh;

	private String gtmonhoc;

	public String getMamh() {
		return mamh;
	}

	public void setMamh(String mamh) {
		this.mamh = mamh;
	}

	public String getTenmh() {
		return tenmh;
	}

	public void setTenmh(String tenmh) {
		this.tenmh = tenmh;
	}

	public String getGtmonhoc() {
		return gtmonhoc;
	}

	public void setGtmonhoc(String gtmonhoc) {
		this.gtmonhoc = gtmonhoc;
	}

}
