package com.ani.drools.decision.demo.model;

/**
 * 
 * @author Ani
 * This is input model for API
 *
 */
public class OrderRequest {   
    private PaymentType paymentType;
    private String attrName;
    
	public PaymentType getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	public String getAttrName() {
		return attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
    
    
    
}