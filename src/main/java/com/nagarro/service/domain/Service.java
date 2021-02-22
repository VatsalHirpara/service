package com.nagarro.service.domain;

import com.nagarro.service.enums.ServiceCategory;
import com.nagarro.service.enums.ServiceName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Service {
    private Integer id;

    private ServiceCategory serviceCategory;
    
    private ServiceName serviceName;

    private Double price;

}
