package com.fundulearobertionut.musicality.controllers;

import com.fundulearobertionut.musicality.models.Instrument;
import com.fundulearobertionut.musicality.models.Musician;
import com.fundulearobertionut.musicality.services.MusicianService;
import io.swagger.models.Response;
import org.apache.tomcat.util.http.parser.HttpParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MusicianController {

    @Autowired
    private MusicianService musicianService;

    @GetMapping(path = "/musicians")
    public ResponseEntity<List<Musician>> getAllMusicians()
    {
        return new ResponseEntity<List<Musician>>(musicianService.getAllMusicians(), HttpStatus.OK);
    }

    @GetMapping(path = "/musician/{id}")
    public ResponseEntity<Musician> getMusician(Long id)
    {
        return new ResponseEntity<Musician>(musicianService.getMusician(id), HttpStatus.OK);
    }

    @PostMapping(path = "/musician")
    public ResponseEntity<Musician> addMusician(@RequestBody Musician musician)
    {
        return new ResponseEntity<Musician>(musicianService.addMusician(musician), HttpStatus.OK);
    }

    @PutMapping(path = "/musician/{id}")
    public ResponseEntity<Musician> updateMusician(@RequestBody Musician musician, @PathVariable Long id)
    {
        return new ResponseEntity<Musician>(musicianService.updateMusician(musician), HttpStatus.OK);
    }

    @DeleteMapping(path = "/musician/{id}")
    public ResponseEntity<Musician> deleteMusician(@PathVariable Long id)
    {
        musicianService.deleteMusician(id);
        return new ResponseEntity<Musician>(HttpStatus.OK);
    }
}
