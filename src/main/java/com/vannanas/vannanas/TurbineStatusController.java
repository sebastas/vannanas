package com.vannanas.vannanas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurbineStatusController {

    @GetMapping("/turbinestatus")
    public boolean TurbinStatus() {

        //return TurbineStatus.isTurbinStatus();
        return true;
    }
}
