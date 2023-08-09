package com.springdata.first.controller;


import com.springdata.first.model.Dto.AdminDto;
import com.springdata.first.model.Entity.Admin;
import com.springdata.first.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admins")
public class AdminController {

    private final AdminService adminService;


@Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/get-admin")
    public AdminDto getAdmin(@RequestParam Integer id){
    return adminService.getAdmin(id);
}

@PostMapping("/save-admin")
public AdminDto save(@RequestBody AdminDto admin){
    return adminService.saveAdmin(admin);
}


@DeleteMapping("/delete-admin")
public void delete(@RequestParam Integer id){
  adminService.deleteAdmin(id);
}

@GetMapping("get-all")
public List<Admin> getAll(){return this.adminService.getAll();}


}
