package com.java8practice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
     int age;
     String name;

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Person person = (Person) o;
          return age == person.age && Objects.equals(name, person.name);
     }

     @Override
     public int hashCode() {
          return Objects.hash(age, name);
     }
}
