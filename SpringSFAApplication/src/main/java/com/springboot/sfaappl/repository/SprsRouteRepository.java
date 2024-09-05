package com.springboot.sfaappl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.sfaappl.entity.SprsRoute;

@Repository
public interface SprsRouteRepository extends JpaRepository<SprsRoute, Long>{

}
