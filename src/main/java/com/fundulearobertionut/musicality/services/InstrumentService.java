package com.fundulearobertionut.musicality.services;

import com.fundulearobertionut.musicality.models.Album;
import com.fundulearobertionut.musicality.models.Instrument;
import com.fundulearobertionut.musicality.models.Musician;
import com.fundulearobertionut.musicality.repositories.InstrumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InstrumentService {

    @Autowired
    private InstrumentRepository instrumentRepository;

    public List<Instrument> getAllInstruments()
    {
        List<Instrument> instruments = new ArrayList<>();
        instrumentRepository.findAll().forEach(instruments::add);
        return instruments;
    }


    public Instrument getInstrument(Long id)
    {
        return instrumentRepository.findById(id).get();
    }

    public Instrument addInstrument(Instrument musician)
    {
        return instrumentRepository.save(musician);
    }

    public Instrument updateInstrument(Instrument musician)
    {
        return instrumentRepository.save(musician);
    }

    public void deleteInstrument(Long id)
    {
        instrumentRepository.deleteById(id);
    }
}
