package com.offcn.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@JsonIgnoreProperties( value={"hibernateLazyInitializer","handler"})
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name",length = 255,nullable = false)
    private String name;

    @Column(name = "age",length = 5,nullable = false)
    private Integer age;

}
