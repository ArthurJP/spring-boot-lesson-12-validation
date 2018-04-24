package com.jp.springbootlesson12validation.domain;

import com.jp.springbootlesson12validation.bean.validation.constraints.PersonNamePrefix;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by 张俊鹏 on 4/23/2018
 */
public class Person {
    @NotNull
    @PersonNamePrefix(prefix = "vaporized-")
    private String name;

    @Size(min = 0,max = 200,message = "")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
