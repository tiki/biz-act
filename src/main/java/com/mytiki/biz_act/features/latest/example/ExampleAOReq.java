package com.mytiki.biz_act.features.latest.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ExampleAOReq {
    private String name;

    @JsonCreator
    public ExampleAOReq(@JsonProperty(required = true) String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
