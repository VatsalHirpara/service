package com.nagarro.service.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.nagarro.service.domain.Service;
import com.nagarro.service.enums.ServiceCategory;
import com.nagarro.service.enums.ServiceName;
import com.nagarro.service.service.ServiceService;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService{

    private List<Service> servicesList = new ArrayList<>();

    /**
     * populates data into list after object is created.
     */
    @PostConstruct
    public void populateData() {
	Service service1 = new Service();
	service1.setId(1);
	service1.setPrice(299.0);
	service1.setServiceCategory(ServiceCategory.SALON_FOR_MEN);
	service1.setServiceName(ServiceName.HAIRCUT);
	Service service2 = new Service();
	service2.setId(2);
	service2.setPrice(189.0);
	service2.setServiceCategory(ServiceCategory.APPLIANCE_REPAIR);
	service2.setServiceName(ServiceName.AC_REPAIR);
	Service service3 = new Service();
	service3.setId(3);
	service3.setPrice(449.0);
	service3.setServiceCategory(ServiceCategory.PLUMBERS);
	service3.setServiceName(ServiceName.BATH_FITTING);
	servicesList.add(service1);
	servicesList.add(service2);
	servicesList.add(service3);
    }

    @Override
    public List<Service> getAllServices() {
	return this.servicesList;
    }

    @Override
    public void addService(Service service) {
	this.servicesList.add(service);	
    }
    
    
}
