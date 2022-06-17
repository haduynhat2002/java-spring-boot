package com.example.t2009m1javaspingboot.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Product {
    private int id;
    private String name;
    private String description;
    private int status;
}
