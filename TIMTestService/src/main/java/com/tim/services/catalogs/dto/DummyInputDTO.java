package com.tim.services.catalogs.dto;

import com.lhs.ccb.sfw.remoting.annotations.DTO;

@DTO
public class DummyInputDTO {
    private String name;

    public DummyInputDTO() {
    }

    public String dto() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "name = " + this.name;
    }

    public String getName() {
        return this.name;
    }
}
