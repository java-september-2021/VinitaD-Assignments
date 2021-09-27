package com.vinita.albums.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vinita.albums.models.Album;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Long> {
	//select all from aalbums
	List<Album> findAll();
}
