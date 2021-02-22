package com.nagarro.service.service;

import java.util.List;

import com.nagarro.service.domain.Service;

public interface ServiceService{
    public List<Service>getAllServices();

    public void addService(Service service);
}
