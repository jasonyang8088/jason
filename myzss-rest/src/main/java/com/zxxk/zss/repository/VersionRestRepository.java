package com.zxxk.zss.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.zxxk.zss.entity.Version;

public interface VersionRestRepository extends PagingAndSortingRepository<Version, Long>{
	
	public List<Version> findBySubjectStage(@Param("stage") Byte stage);

}
