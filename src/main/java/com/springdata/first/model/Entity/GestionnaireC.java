package com.springdata.first.model.Entity;


import com.springdata.first.model.Dto.GestionnaireCDto;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Table(name = "gestionnairecs")
@Entity
@Data
@Builder
public class GestionnaireC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gestionnairec-id")
    private Integer id;

    @Column(name ="first-name")
    private String firstName;

    @Column(name="last-name")
    private String lastName;

    @Column(name="email")
private String email;

    @Column(name="password")
    private String password;

    public GestionnaireC(Integer id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public GestionnaireC() {

    }
    public  static GestionnaireC toEntity(GestionnaireCDto Dto){
        return  GestionnaireC.builder()
                .id(Dto.getId())
                .firstName(Dto.getFirstName())
                .lastName(Dto.getLastName())
                .email(Dto.getEmail())
                .password(Dto.getPassword())
                .build();
    }
}
