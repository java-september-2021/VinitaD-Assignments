package com.vinita.albums.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinita.albums.models.Album;
import com.vinita.albums.repositories.AlbumRepository;

@Service
public class AlbumService {
	@Autowired  //instead for constructor
	private AlbumRepository aRepo;
	
	public List<Album> getAllAlbums() {
		return this.aRepo.findAll();
	}
	
	public Album getOneAlbum(Long id) {
		return this.aRepo.findById(id).orElse(null);
	}
	public Album createAlbum(Album album) {
		return this.aRepo.save(album);
	}
	public Album editAlbum(Album album) {
		return this.aRepo.save(album);
	}
	public void deleteAlbum(Long id) {
		this.aRepo.deleteById(id);
	}
}
