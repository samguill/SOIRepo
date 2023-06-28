package com.tim.services;

import com.lhs.ccb.sfw.application.DomainServiceAdapter;
import com.tim.services.catalogs.dto.DummyInputDTO;
import com.tim.services.catalogs.dto.DummyOutputDTO;
import com.lhs.ccb.sfw.remoting.soi.annotations.SOICommand;
import com.lhs.ccb.sfw.remoting.soi.annotations.SOICommandAdapter;
import org.springframework.stereotype.Service;


@SOICommandAdapter
@Service("TestService")
public class TestService {

    @SOICommand(
            name="TESTSERVICE.READ",
            version="CMD_1_0"
    )
    public DummyOutputDTO read(DummyInputDTO idto) {
        DummyOutputDTO dto = new DummyOutputDTO();
        dto.setName(idto.getName() + " , Welcome");
        return dto;
    }
}
