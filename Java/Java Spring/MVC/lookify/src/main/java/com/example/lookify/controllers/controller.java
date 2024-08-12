package com.example.lookify.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.lookify.lookify.models.Song;
import com.lookify.lookify.services.SongService;

import jakarta.validation.Valid;


@Controller
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("songs", songService.allSongs());
        return "dashboard";
    }

    @GetMapping("/songs/new")
    public String newSong(@ModelAttribute("song") Song song) {
        return "new";
    }

    @PostMapping("/songs")
    public String create(@Valid @ModelAttribute("song") Song song, BindingResult result) {
        if (result.hasErrors()) {
            return "new";
        } else {
            songService.createSong(song);
            return "redirect:/dashboard";
        }
    }

    @GetMapping("/songs/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Song song = songService.findSong(id);
        model.addAttribute("song", song);
        return "details";
    }

    @RequestMapping(value="/songs/{id}/delete", method={RequestMethod.DELETE, RequestMethod.GET})
    public String destroy(@PathVariable("id") Long id) {
        songService.deleteSong(id);
        return "redirect:/dashboard";
    }

    @GetMapping("/search")
    public String search(@RequestParam("artist") String artist, Model model) {
        model.addAttribute("songs", songService.searchSongs(artist));
        model.addAttribute("artist", artist);
        return "search";
    }

    @GetMapping("/search/topTen")
    public String topTen(Model model) {
        model.addAttribute("songs", songService.topTenSongs());
        return "topTen";
    }
}

