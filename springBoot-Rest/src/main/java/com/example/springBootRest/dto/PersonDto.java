package com.example.springBootRest.dto;


//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

// PersonDto kullanmamin sebebi gosterim katmanina Person Class inin istedigim ozelliklerin gosterimini saglamaktir.
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonDto {


    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String surname;
    @NotNull
    private int salary;

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }



}
