package com.nagarro.service.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.service.domain.Service;
import com.nagarro.service.service.ServiceService;

@RestController
@RequestMapping(value = "/service")
public class ServiceController {
    @Autowired
    ServiceService serviceService;

    @GetMapping
    public List<Service> getServices() {
	return serviceService.getAllServices();
    }

    @PostMapping()
    public ResponseEntity<String> addService(@Valid @RequestBody Service service) {
	serviceService.addService(service);
	return new ResponseEntity<>("Service successfully added", HttpStatus.CREATED);
    }

}
