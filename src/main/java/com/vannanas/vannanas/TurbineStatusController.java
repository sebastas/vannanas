package com.vannanas.vannanas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TurbineStatusController extends BaseController {

    public final String endpoint_name = "Turbines";

    @GetMapping("/turbinestatus")
    public String turbineStatus() throws IOException, InterruptedException {
        return super.handleRequest(endpoint_name);
    }
}
