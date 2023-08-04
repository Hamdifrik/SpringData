package com.springdata.first.model.Dto;


import com.springdata.first.model.Entity.Employee;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDto {

    private Integer id;
    private String firstName;
    private String lastName;
    private Double salary;

    public static EmployeeDto toDto(Employee entity){
        return EmployeeDto.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .salary(entity.getSalary())
                .build();
    }


}
