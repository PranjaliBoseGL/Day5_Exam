package com.exam.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter

@Getter

@Entity

public class Customer {



  @Id

  @Column

  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Integer id;



  @Column

  private String name;



  @Column

  private String email;



  @Column

  private String country;



 public Integer getId() {

 return id;

 }



 public void setId(Integer id) {

 this.id = id;

 }



 public String getName() {

 return name;

 }



 public void setName(String name) {

 this.name = name;

 }



 public String getEmail() {

 return email;

 }



 public void setEmail(String email) {

 this.email = email;

 }



 public String getCountry() {

 return country;

 }



 public void setCountry(String country) {

 this.country = country;

 }

   



}







