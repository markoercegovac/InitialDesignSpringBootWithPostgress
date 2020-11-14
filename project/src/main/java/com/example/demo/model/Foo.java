package com.example.demo.model;

import lombok.Data;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.persistence.*;

@Data
@Table
@Entity
public class Foo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

}
