package com.javarush.services;

import com.javarush.entities.Supervisor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupervisorsTaxCounter {
    private final SupervisorsSalaryCounter supervisorsSalaryCounter;

    public SupervisorsTaxCounter(SupervisorsSalaryCounter supervisorsSalaryCounter) {
        this.supervisorsSalaryCounter = supervisorsSalaryCounter;
    }

    public String getSupervisorsTaxes() {
        StringBuilder result = new StringBuilder();
        List<Supervisor> supervisorsSalary = supervisorsSalaryCounter.getSupervisorsSalary();
        for (Supervisor supervisor : supervisorsSalary) {
            result.append(supervisor.getName()).append(" : ").append(supervisor.getSalary() * 0.25).append('\n');
        }
        return result.toString();
    }
}
