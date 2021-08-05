package com.example.demo.entity;



import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author : mac
 * create at:  2019-12-05  20:05
 * @description:
 */
@Data
public class Student implements Serializable {
    private String id;
    private String name;
    private int age;
    private List<String> ids;
}
