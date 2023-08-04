package com.springdata.first.model.Entity;

import com.springdata.first.model.Dto.EmployeeDto;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Table(name = "employees")
@Entity
@Data
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "salary")
    private Double salary;

    // Lombok @Builder will generate this constructor for you
    public Employee(Integer id, String firstName, String lastName, Double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Constructor without arguments
    public Employee() {
    }
    public static Employee toEntity(EmployeeDto dto){
        return Employee.builder()
                .id(dto.getId())
                .firstName((dto.getFirstName()))
                .lastName(dto.getLastName())
                .salary(dto.getSalary())
                .build();
    }
}
