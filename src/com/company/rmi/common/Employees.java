package com.company.rmi.common;

import java.io.Serializable;

/**
 * @Author: Joylice
 * @Date: 2019/7/31 14:58
 */

public class Employees implements Serializable {
    private String id;
    private String name;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
}
