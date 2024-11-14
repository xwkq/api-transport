package com.sui.api_transport.controllers;

import com.sui.api_transport.interfaces.IConductorService;
import com.sui.api_transport.pojo.Conductor;
import com.sui.api_transport.routing.ApiPath;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = ApiPath.API_PATH + ApiPath.CONDUCTOR_CONTROLLER_PATH)
public class ConductorController {
    private IConductorService conductorService;

    @GetMapping("/conductors")
    public List<Conductor> conductors(){
        return null;
    }

    @PostMapping("/conductor")
    public ResponseEntity<Conductor> conductor(@RequestBody Conductor conductor){
        return null;
    }
}
