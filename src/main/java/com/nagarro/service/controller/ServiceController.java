package com.nagarro.service.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.service.domain.ServiceEntity;
import com.nagarro.service.dto.ResponseTO;
import com.nagarro.service.service.ServiceService;

@RestController
@RequestMapping(value = "/services")
public class ServiceController {
	@Autowired
	ServiceService serviceService;

	@GetMapping
	public ResponseEntity<ResponseTO<List<ServiceEntity>>> getServices() {
		ResponseTO<List<ServiceEntity>> response = new ResponseTO<>();
		response.setData(serviceService.getAllServices());
		return ResponseEntity.ok(response);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ResponseTO<ServiceEntity>> getServiceById(@PathVariable @Valid Integer id) throws Exception {
		ResponseTO<ServiceEntity> response = new ResponseTO<>();
		response.setData(serviceService.getServiceById(id));
		return ResponseEntity.ok(response);
	}

}
