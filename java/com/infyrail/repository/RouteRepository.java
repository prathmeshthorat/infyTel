package com.infyrail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infyrail.entity.RouteEntity;
@Repository
public interface RouteRepository extends JpaRepository<RouteEntity, Integer>{

}
