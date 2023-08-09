package com.springdata.first.service;
import com.springdata.first.model.Dto.EmployeeDto;
import com.springdata.first.model.Dto.UserDto;
import com.springdata.first.model.Entity.Employee;
import com.springdata.first.model.Entity.User;
import com.springdata.first.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public UserDto getUser(Integer id) {
        Optional<User> user = this.userRepo.findById(id);
        if (user.isPresent())
            return UserDto.DTO(user.get());

        else
            return null;

    }

    public UserDto saveUser(UserDto user) {
        return UserDto.DTO(userRepo.save(User.ToEntity(user)));
    }

    public void deleteUser(Integer id) {
        this.userRepo.deleteById(id);
    }


    public List<User> getAll() {
        return this.userRepo.findAll();
    }

}