package com.springdata.first.controller;

import com.springdata.first.model.Dto.EmployeeDto;
import com.springdata.first.model.Entity.Employee;
import com.springdata.first.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    private final EmpService empService; // le mot clé "final" pour rendre le champ "empService" immuable.

    @Autowired // cette annotation pour activer l'injection de dépendance.
    public EmployeeController(EmpService empService) {
        this.empService = empService;
    }

    @GetMapping("/get-emp")
    public EmployeeDto getUser(@RequestParam Integer id){
        return empService.getUser(id);
    }

    @PostMapping("/save-emp")
    public EmployeeDto save(@RequestBody EmployeeDto employee){
        return empService.saveEmp(employee);
    }

    @PostMapping("/upadate-emp")
    public EmployeeDto upadate(@RequestBody EmployeeDto employee){
        return empService.saveEmp(employee);
    }

    @DeleteMapping("/delete-emp")
    public void delete(@RequestParam Integer id){
        empService.delete(id);
    }

    @GetMapping("/get-all")
    public List<Employee> getAll(){
       return this.empService.getAll();
    }

}
