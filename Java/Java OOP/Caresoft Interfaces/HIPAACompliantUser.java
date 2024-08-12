package com.caresoft.clinicapp.demo;

public interface HIPAACompliantUser {
    abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
}