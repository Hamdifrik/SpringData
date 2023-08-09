package com.springdata.first.service;

import com.springdata.first.model.Dto.AdminDto;
import com.springdata.first.model.Entity.Admin;
import com.springdata.first.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepo adminrepo;

    public AdminDto getAdmin(Integer id){
        Optional<Admin> admin=this.adminrepo.findById(id);
        if (admin.isPresent())
            return AdminDto.toDto(admin.get());
        else
            return null;
    }

    public AdminDto saveAdmin(AdminDto admin){
        return AdminDto.toDto(adminrepo.save(Admin.toEntity(admin)));
    }

public void deleteAdmin(Integer id){
        this.adminrepo.deleteById(id);
}

public List<Admin> getAll(){
       return this.adminrepo.findAll();
}
}


