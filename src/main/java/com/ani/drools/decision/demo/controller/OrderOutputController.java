package com.ani.drools.decision.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ani.drools.decision.demo.model.OrderOutput;
import com.ani.drools.decision.demo.model.OrderRequest;
import com.ani.drools.decision.demo.service.OrderOutputService;
 
/**
 * 
 * @author Ani
 * Restcontroller for orderoutput
 *
 */
 
@RestController
public class OrderOutputController {
 
    @Autowired
    private OrderOutputService orderOutputService;
    
 
    
    public void setOrderOutputService(OrderOutputService orderOutputService) {
		this.orderOutputService = orderOutputService;
	}




	@PostMapping("/get-output")
    public ResponseEntity<OrderOutput> getOutput(@RequestBody OrderRequest orderRequest) {
        OrderOutput output = orderOutputService.getOutput(orderRequest);
        return new ResponseEntity<>(output, HttpStatus.OK);
    }
}
