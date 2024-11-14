package com.sui.api_transport.services;

import com.sui.api_transport.interfaces.IConductorService;
import com.sui.api_transport.pojo.Conductor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConductorService implements IConductorService {
    /**
     * @param conductor
     * @return
     */
    @Override
    public Conductor create(Conductor conductor) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Conductor> conductors() {
        return List.of();
    }
}
