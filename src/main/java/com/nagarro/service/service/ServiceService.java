package com.nagarro.service.service;

import java.util.List;

import com.nagarro.service.domain.ServiceEntity;

public interface ServiceService{
    public List<ServiceEntity>getAllServices();

	public ServiceEntity getServiceById(Integer id) throws Exception;
}
