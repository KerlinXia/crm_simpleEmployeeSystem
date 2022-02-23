package com.kerlin.domain;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Long id;
    private String name;
    private String sn;

    public Department(String name,String sn){
        this.name = name;
        this.sn = sn;
    }
}
