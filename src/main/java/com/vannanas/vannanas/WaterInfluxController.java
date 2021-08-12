package com.vannanas.vannanas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.ArrayList;

@RestController
public class WaterInfluxController {

    long waterInflux;

    @GetMapping("/waterinflux")
    public long waterInflux() {
        WaterInflux.getWaterInflux();
        //return waterInflux;
        return 4;
    }
}