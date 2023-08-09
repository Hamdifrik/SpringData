package com.springdata.first.model.Dto;


import com.springdata.first.model.Entity.Admin;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminDto {
   private Integer id;
   private String firstName;
   private String lastName;
   private String email;
   private String password;


   public static AdminDto toDto(Admin entity){
return AdminDto.builder()
        .id(entity.getId())
        .firstName(entity.getFirstName())
        .lastName(entity.getLastName())
        .email(entity.getEmail())
        .password(entity.getPassword())
        .build();
   }
}
