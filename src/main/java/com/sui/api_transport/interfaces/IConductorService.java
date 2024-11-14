package com.sui.api_transport.interfaces;

import com.sui.api_transport.pojo.Conductor;

import java.util.List;

public interface IConductorService {
    Conductor create(Conductor conductor);
    List<Conductor> conductors();
}
