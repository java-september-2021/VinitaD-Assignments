package com.vinita.lookify.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vinita.lookify.models.Music;

@Repository
public interface LookifyRepository extends CrudRepository<Music, Long> {
	//List<Music> findByArtist(String search);
	List<Music> findTop10ByOrderByRatingDesc();
	List<Music> findByArtistContaining(String artist);
	List<Music> findAll();
}
