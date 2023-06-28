package com.tim.services.catalogs.dto;

import com.lhs.ccb.sfw.remoting.annotations.DTO;

@DTO
public class DummyOutputDTO {
    private String name;

    public DummyOutputDTO() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "name = " + this.name;
    }
}



