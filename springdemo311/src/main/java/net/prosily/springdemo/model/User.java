package net.prosily.springdemo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data // говорит то что геттеры и сеттеры по умолчанию
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "email")
    private String email;

}

