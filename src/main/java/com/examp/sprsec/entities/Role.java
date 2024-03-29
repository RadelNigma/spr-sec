package com.examp.sprsec.entities;

import lombok.Data;
//import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Data
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
