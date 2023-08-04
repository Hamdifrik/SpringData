package com.springdata.first.service;

import com.springdata.first.model.Dto.EmployeeDto;
import com.springdata.first.model.Entity.Employee;
import com.springdata.first.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
@Autowired
    private EmpRepo empRepo;

public EmployeeDto getUser(Integer id){
    Optional<Employee> emp =this.empRepo.findById(id);
  if (emp.isPresent())
      return EmployeeDto.toDto(emp.get());
  else
      return null;
}


    public EmployeeDto saveEmp(EmployeeDto employee){
        return EmployeeDto.toDto(empRepo.save(Employee.toEntity(employee)));
    }


public void delete(Integer id){
    this.empRepo.deleteById(id);
}


    public List<Employee> getAll() {
    return this.empRepo.findAll();
    }
}
