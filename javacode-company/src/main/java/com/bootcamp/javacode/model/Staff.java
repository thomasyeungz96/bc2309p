package com.bootcamp.javacode.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// @Builder // extends
@SuperBuilder
public class Staff extends Person {

  private int age;

  public Staff(String name, int age) {
    super(name);
    this.age = age;
  }

  public boolean isAdult() {
    return this.age >= 18;
  }

  public static void main(String[] args) {
    Staff staff = new Staff("John", 20);
    System.out.println(staff.getAge());
    System.out.println(staff.getName());
    // no args constructor
    Staff staff2 = new Staff();
    // toString()
    System.out.println(staff);
    // equals()
    Staff staff3 = new Staff("John", 20);
    System.out.println(staff.equals(staff3)); // true
    // hashCode()
    System.out.println(staff.hashCode()); // 2319200
    System.out.println(staff3.hashCode()); // 2319200

    Staff staff4 = Staff.builder() //
        .name("Steven") //
        .age(30) //
        .build();
    System.out.println(staff4);
  }

}
