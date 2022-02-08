package com.ani.drools.decision.demo.model;

public enum PaymentType {
    PHYPRD, BOOK, MEMBERSHIP, UPG_MEMBERSHIP, VIDEO ;
 
    public String getValue() {
        return this.toString();
    }
}
