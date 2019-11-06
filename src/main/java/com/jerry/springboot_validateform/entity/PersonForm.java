package com.jerry.springboot_validateform.entity;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Setter
@Getter
public class PersonForm {
    @NotNull
    @Size(min = 2,max = 30)
    private String name;
    @NotNull
    @Min(18)
    private Integer age;

    @Override
    public String toString() {
        return "PersonForm{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
