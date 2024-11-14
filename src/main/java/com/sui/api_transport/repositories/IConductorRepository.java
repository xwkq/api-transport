package com.sui.api_transport.repositories;

import com.sui.api_transport.pojo.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConductorRepository extends JpaRepository<Conductor, Long> {
}
