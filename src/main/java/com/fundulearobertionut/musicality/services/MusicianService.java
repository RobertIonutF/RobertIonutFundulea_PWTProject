package com.fundulearobertionut.musicality.services;

import com.fundulearobertionut.musicality.models.Musician;
import com.fundulearobertionut.musicality.repositories.MusicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicianService {

    @Autowired
    private MusicianRepository musicianRepository;

    public List<Musician> getAllMusicians()
    {
        List<Musician> musicians = new ArrayList<>();
        musicianRepository.findAll().forEach(musicians::add);
        return musicians;
    }

    public Musician getMusician(Long id)
    {
        return musicianRepository.findById(id).get();
    }

    public Musician addMusician(Musician musician)
    {
        return musicianRepository.save(musician);
    }

    public Musician updateMusician(Musician musician)
    {
        return musicianRepository.save(musician);
    }

    public void deleteMusician(Long id)
    {
        musicianRepository.deleteById(id);
    }
}
