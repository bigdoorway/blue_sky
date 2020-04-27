package com.byvoid.poo;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreType
public class PersonInfoList {
    @JsonPropertyOrder({"1"})
    private String name;
    @JsonPropertyOrder({"2"})
    private Integer age;
    @JsonPropertyOrder({"3"})
    @JsonProperty("id_card")
    private String idCard;

    public PersonInfoList(String name, Integer age, String idCard){
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
