package com.javarush.services;

import com.javarush.entities.Supervisor;
import com.javarush.repository.SupervisorDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupervisorsSalaryCounter {
    private final SupervisorDAO supervisorDAO;

    public SupervisorsSalaryCounter(SupervisorDAO supervisorDAO) {
        this.supervisorDAO = supervisorDAO;
    }

    public List<Supervisor> getSupervisorsSalary() {
        List<Supervisor> supervisors = supervisorDAO.findAll();
        for (Supervisor supervisor : supervisors) {
            supervisor.setSalary(supervisor.getSalary()*2);
        }
        return supervisors;
    }
}
