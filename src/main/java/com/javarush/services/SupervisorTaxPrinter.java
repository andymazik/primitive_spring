package com.javarush.services;

import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
public class SupervisorTaxPrinter {
    private final SupervisorsTaxCounter supervisorsTaxCounter;

    public SupervisorTaxPrinter(SupervisorsTaxCounter supervisorsTaxCounter) {
        this.supervisorsTaxCounter = supervisorsTaxCounter;
    }

    public void printSupervisorTaxes() {
        String supervisorsTaxes = supervisorsTaxCounter.getSupervisorsTaxes();
        System.out.println(supervisorsTaxes);
    }
}
