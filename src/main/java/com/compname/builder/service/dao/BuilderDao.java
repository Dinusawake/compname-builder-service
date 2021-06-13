package com.compname.builder.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compname.builder.service.entity.BuilderEntity;



public interface BuilderDao extends JpaRepository<BuilderEntity, Integer> {
	

}