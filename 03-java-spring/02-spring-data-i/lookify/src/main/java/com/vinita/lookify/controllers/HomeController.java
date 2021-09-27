package com.vinita.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vinita.lookify.models.Music;
import com.vinita.lookify.services.LookifyService;

@Controller
public class HomeController {
	@Autowired
	private LookifyService lService;
	
	@GetMapping(value="/")
	public String welcome() {
		return "dashboard.jsp";
	}
	//to display all the songs
	@GetMapping(value = "/dashboard")
	public String index(Model myModel, @ModelAttribute("errors") String errors) {
		List<Music> songs = this.lService.allSongs();
		myModel.addAttribute("songs", songs);
		System.out.println(errors);
		return "index.jsp";
	}

	
	//form for a new song and adding it
	@GetMapping("/songs/new")
	public String newSong(@ModelAttribute("music") Music music) {
		return "new.jsp";
	}
	@PostMapping(value="/songs")
	public String create(@Valid @ModelAttribute("music") Music music, BindingResult result) {
        if (result.hasErrors()) {
            return "new.jsp";
        } else {
            lService.createMusic(music);
            return "redirect:/dashboard";
        }
    }
	
	
	//delete a music
	@DeleteMapping(value="/delete/{id}")
    public String destroy(@PathVariable("id") Long id) {
        lService.destroy(id);
        return "redirect:/dashboard";
    }
	
	//showing a detail of a music track
	@GetMapping(value="/songs/{id}")
	public String showdetail(@PathVariable("id") Long id, Model myModel) {
		Music targetMusic = this.lService.getLang(id);
		myModel.addAttribute("song",targetMusic);
		return "show.jsp";
	}
	
	//get top ten songs
	@GetMapping("/search/topTen")
	public String topSong(Model myModel) {
		List<Music> top = this.lService.topTen();
//		List<Music> top10;
//		for(int i = 0; i<10; i++ ) {
//			top10.add(top[i]);
//		}
////		System.out.println(top10);
		myModel.addAttribute("songs",top);
		return "topTen.jsp";
	}
	
	//search a artist
	@GetMapping(value= "/search")
	public String searchArtist(@RequestParam("artist") String artist, Model model, RedirectAttributes redirectAttributes) {
		String targetArtist= (String) artist;
		List<Music> artistsearch = this.lService.findAllByName(targetArtist);
		if(artistsearch.size() == 0) {
			redirectAttributes.addFlashAttribute("errors", "This Artist not found!");
			return "redirect:/dashboard";
		}
		model.addAttribute("songs", artistsearch);
		System.out.println(artistsearch);
		return "artist.jsp";
					
	}
	
}
