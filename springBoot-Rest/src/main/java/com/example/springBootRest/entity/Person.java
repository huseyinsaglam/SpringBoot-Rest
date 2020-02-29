package com.example.springBootRest.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


// Serializable kullanmamin sebebi objelerin daha sonra rahat okunup dosyaya yazmak ve disk'e yazmasini saglamaktir.
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "personTable")
public class Person implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "personName", length = 50)
    private String name;
    @Column(name = "personSurname",length = 50)
    private String surname;
    @Column(name = "personSalary",length = 10)
    private int salary;



    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
