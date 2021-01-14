package com.fundulearobertionut.musicality.controllers;

import com.fundulearobertionut.musicality.models.Song;
import com.fundulearobertionut.musicality.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping(path = "/songs")
    public ResponseEntity<List<Song>> getAllSongs()
    {
        return new ResponseEntity<List<Song>>(songService.getAllSongs(), HttpStatus.OK);
    }

    @GetMapping(path = "/song/{id}")
    public ResponseEntity<Song> getSong(@PathVariable Long id)
    {
        return new ResponseEntity<Song>(songService.getSong(id), HttpStatus.OK);
    }

    @PostMapping(path = "/song")
    public ResponseEntity<Song> addSong(@RequestBody Song song)
    {
        return new ResponseEntity<Song>(songService.addSong(song), HttpStatus.OK);
    }

    @PutMapping(path = "/sonng/{id}")
    public ResponseEntity<Song> updateSong(@RequestBody Song song, @PathVariable Long id)
    {
        return new ResponseEntity<Song>(songService.updateSong(song), HttpStatus.OK);
    }

    @DeleteMapping(path = "/song/{id}")
    public ResponseEntity<Song> deleteSong(@PathVariable Long id)
    {
        songService.deleteSong(id);
        return new ResponseEntity<Song>(HttpStatus.OK);
    }
}
