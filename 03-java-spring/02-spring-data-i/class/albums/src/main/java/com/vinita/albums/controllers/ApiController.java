package com.vinita.albums.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinita.albums.models.Album;
import com.vinita.albums.services.AlbumService;

@RestController
@RequestMapping("/api")
public class ApiController {
	@Autowired
	private AlbumService aService;
	
	@GetMapping("")
	public List<Album> allAlbum(){
		return this.aService.getAllAlbums();
	}
	@GetMapping("/{id}")
	public Album getOne(@PathVariable("id") Long id) {
		return this.aService.getOneAlbum(id);
	}
	@PostMapping("/create")
	public Album create(Album album) {
		return this.aService.createAlbum(album);
	}
	@DeleteMapping("/{id}")
	public String deleteAlbum(@PathVariable("id") Long id) {
		this.aService.deleteAlbum(id);
		return "This album is deleted";
	}
}
