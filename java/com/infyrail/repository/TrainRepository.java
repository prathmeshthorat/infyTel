package com.infyrail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infyrail.entity.TrainEntity;

@Repository
public interface TrainRepository extends JpaRepository<TrainEntity, Integer>{

}
