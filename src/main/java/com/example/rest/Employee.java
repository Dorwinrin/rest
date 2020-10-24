package com.example.rest;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    
  private @Id @GeneratedValue Long id;
  private String firstName;
  private String lastName;
  private String role;


  public Employee() {
  }

  public Employee(String firstName, String lastName, String role) {    
    this.firstName = firstName;
    this.lastName = lastName;
    this.role = role;
  }

  public Long getId() {
    return this.id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getName() {
    return this.firstName + " " + this.lastName;
  }

  public String getRole() {
    return this.role;
  }
  
  public void setId(Long id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setName(String name) {
    String[] parts = name.split(" ");
    this.firstName = parts[0];
    this.lastName = name.substring(parts[0].length() + 1);
  }  

  public void setRole(String role) {
    this.role = role;
  }
  
  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) 
          && Objects.equals(firstName, employee.firstName) 
          && Objects.equals(lastName, employee.lastName) 
          && Objects.equals(role, employee.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, role);
  }

  @Override
  public String toString() {
    return "Employee:{" +
      " id='" + getId() + "'" +
      ", first name='" + getFirstName() + "'" +
      ", last name='" + getLastName() + "'" +
      ", role='" + getRole() + "'" +
      "}";
  }
}
