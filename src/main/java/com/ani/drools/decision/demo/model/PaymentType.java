package com.ani.drools.decision.demo.model;

/**
 * 
 * @author Ani
 * This is input model for API with different payment types required for order processing
 *
 */
public enum PaymentType {
    PHYPRD, BOOK, MEMBERSHIP, UPG_MEMBERSHIP, VIDEO ;
 
    public String getValue() {
        return this.toString();
    }
}
