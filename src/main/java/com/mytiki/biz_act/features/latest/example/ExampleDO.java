package com.mytiki.biz_act.features.latest.example;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "example")
public class ExampleDO implements Serializable {

    private Long id;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
