package com.vinita.lookify.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinita.lookify.models.Music;
import com.vinita.lookify.repository.LookifyRepository;

@Service
public class LookifyService {
	@Autowired
	private LookifyRepository lRepo;
	
	public Music createMusic(Music m) {
		return this.lRepo.save(m);
	}
	public Music getLang(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	public Music updateSong(Music l) {
		return this.lRepo.save(l);
	}
	public void destroy(Long id) {
		this.lRepo.deleteById(id);
	}
	public List<Music> findAllByName(String name){
		return this.lRepo.findByArtistContaining(name);
	}
	public List<Music> topTen(){
		return this.lRepo.findTop10ByOrderByRatingDesc();
	}
	public List<Music> allSongs() {
		return this.lRepo.findAll();
	}
	
}
