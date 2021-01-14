package com.fundulearobertionut.musicality.controllers;

import com.fundulearobertionut.musicality.models.Album;
import com.fundulearobertionut.musicality.services.AlbumService;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping(path = "/albums")
    public ResponseEntity<List<Album>> getAllAlbums()
    {
        return new ResponseEntity<List<Album>>(albumService.getAllAlbums(), HttpStatus.OK);
    }

    @GetMapping(path = "/album/{id}")
    public ResponseEntity<Album> getAlbum(@PathVariable Long id)
    {
        return new ResponseEntity<Album>(albumService.getAlbum(id), HttpStatus.OK);
    }

    @PostMapping(path = "/album")
    public ResponseEntity<Album> addAlbum(@RequestBody Album album)
    {
        return new ResponseEntity<Album>(albumService.addAlbum(album), HttpStatus.OK);
    }

    @PutMapping(path = "/album/{id}")
    public ResponseEntity<Album> updateAlbum(@RequestBody Album album, @PathVariable Long id)
    {
        return new ResponseEntity<Album>(albumService.addAlbum(album), HttpStatus.OK);
    }

    @DeleteMapping(path = "/album/{id}")
    public ResponseEntity<Album> deleteAlbum(@PathVariable Long id)
    {
        albumService.deleteAlbum(id);
        return new ResponseEntity<Album>(HttpStatus.OK);
    }
}
