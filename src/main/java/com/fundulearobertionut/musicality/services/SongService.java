package com.fundulearobertionut.musicality.services;

import com.fundulearobertionut.musicality.models.Song;
import com.fundulearobertionut.musicality.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public List<Song> getAllSongs()
    {
        List<Song> songs = new ArrayList<>();
        songRepository.findAll().forEach(songs::add);
        return songs;
    }

    public Song getSong(Long id)
    {
        return songRepository.findById(id).get();
    }

    public Song addSong(Song song)
    {
        return songRepository.save(song);
    }

    public Song updateSong(Song song)
    {
        return songRepository.save(song);
    }

    public void deleteSong(Long id)
    {
        songRepository.deleteById(id);
    }
}
