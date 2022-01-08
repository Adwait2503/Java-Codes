package com.te.springmvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.te.springmvc.daolayer.DaoLayer;
import com.te.springmvc.model.Register;

@Component
public class MvcServices {

	@Autowired
	DaoLayer layer;

	public void save(Register reg) {
		if (reg != null) {
			layer.put(reg);
		}
	}
}
