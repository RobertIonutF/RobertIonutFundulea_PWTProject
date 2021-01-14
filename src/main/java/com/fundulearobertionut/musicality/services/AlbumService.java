package com.fundulearobertionut.musicality.services;

import com.fundulearobertionut.musicality.models.Album;
import com.fundulearobertionut.musicality.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public List<Album> getAllAlbums()
    {
        List<Album> albums = new ArrayList<>();
        albumRepository.findAll().forEach(albums::add);
        return albums;
    }

    public Album getAlbum(Long id)
    {
        return albumRepository.findById(id).get();
    }

    public Album addAlbum(Album album)
    {
        return albumRepository.save(album);
    }

    public Album updateAlbum(Album album)
    {
        return albumRepository.save(album);
    }

    public void deleteAlbum(Long id)
    {
        albumRepository.deleteById(id);
    }
}
