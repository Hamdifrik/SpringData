package com.springdata.first.model.Entity;

import com.springdata.first.model.Dto.AdminDto;
import com.springdata.first.model.Dto.UserDto;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Table(name = "admins")
@Entity
@Data
@Builder

public class Admin {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "admin_id")
   private Integer id;

   @Column(name = "first-name")
   private String firstName;

   @Column(name = "last-name")
   private String lastName;

   @Column(name = "email")
   private String email;

   @Column(name = "password")
   private String password;

    public Admin(Integer id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public Admin() {
    }

    public static Admin toEntity(AdminDto dto){
        return Admin.builder()
                .id(dto.getId())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build();

    }
}
