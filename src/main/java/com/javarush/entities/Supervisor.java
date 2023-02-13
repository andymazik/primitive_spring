package com.javarush.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@SuppressWarnings("JpaDataSourceORMInspection")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name="supervisors", schema = "company")
public class Supervisor {
    @Id
    private Long id;
    private String name;
    private String title;
    private int salary;
    @Column(name = "hire_date")
    private LocalDate hireDate;
    private int subordinates;
    @Column(name = "department_id")
    private int departmentId;
}
