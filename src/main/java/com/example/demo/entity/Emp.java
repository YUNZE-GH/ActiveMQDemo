package com.example.demo.entity;

import java.io.Serializable;

/**
 * @author gaohan
 * @version 1.0
 * @date 2020/8/6 11:21
 */
public class Emp implements Serializable {
    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
