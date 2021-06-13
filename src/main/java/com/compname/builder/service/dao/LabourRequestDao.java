package com.compname.builder.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compname.builder.service.entity.LabourRequestEntity;

public interface LabourRequestDao extends JpaRepository<LabourRequestEntity, Integer>{

}
