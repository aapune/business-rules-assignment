package com.ani.drools.decision.demo.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ani.drools.decision.demo.model.OrderOutput;
import com.ani.drools.decision.demo.model.OrderRequest;
 

 
@Service
public class OrderOutputService {
 
    @Autowired
    private KieContainer kieContainer;
   
 
    
    public void setKieContainer(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}




	public OrderOutput getOutput(OrderRequest orderRequest) {
        OrderOutput orderOutput = new OrderOutput();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("orderOutput", orderOutput);
        kieSession.insert(orderRequest);
        kieSession.fireAllRules();
        kieSession.dispose();
        return orderOutput;
    }
}