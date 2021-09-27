package com.vinita.license.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vinita.license.models.License;


@Repository
public interface LicenseReository extends CrudRepository<License, Long> {
	List<License> findAll();
	License findTop1ByOrderByNumberDesc();
}
