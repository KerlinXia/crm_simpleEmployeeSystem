package com.kerlin.domain;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String password;
    private String email;
    private int age;
    private Boolean admin;

    private Long deptId;

    //private Department department;
    public Employee(String name,String password,String email,Integer age,Boolean admin,Long deptId){
        this.name = name;
        this.password = password;
        this.email = email;
        this.age = age;
        this.admin = admin;
        this.deptId = deptId;
    }
}
