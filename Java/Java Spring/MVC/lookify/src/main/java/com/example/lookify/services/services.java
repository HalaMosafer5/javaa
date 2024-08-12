package com.example.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lookify.lookify.models.Song;
import com.lookify.lookify.repositories.SongRepository;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public List<Song> allSongs() {
        return songRepository.findAll();
    }

    public Song createSong(Song s) {
        return songRepository.save(s);
    }

    public Song findSong(Long id) {
        Optional<Song> optionalSong = songRepository.findById(id);
        return optionalSong.orElse(null);
    }

    public void deleteSong(Long id) {
        songRepository.deleteById(id);
    }

    public List<Song> searchSongs(String artist) {
        return songRepository.findByArtistContaining(artist);
    }

    public List<Song> topTenSongs() {
        return songRepository.findTop10ByOrderByRatingDesc();
    }
}
}
