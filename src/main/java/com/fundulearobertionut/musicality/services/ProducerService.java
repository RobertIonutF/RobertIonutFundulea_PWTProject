package com.fundulearobertionut.musicality.services;

import com.fundulearobertionut.musicality.models.Producer;
import com.fundulearobertionut.musicality.repositories.ProducerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProducerService {

    @Autowired
    private ProducerRepository producerRepository;

    public List<Producer> getAllProducers()
    {
        List<Producer> producers = new ArrayList<>();
        producerRepository.findAll().forEach(producers::add);
        return producers;
    }

    public Producer getProducer(Long id)
    {
        return producerRepository.findById(id).get();
    }

    public Producer addProducer(Producer producer)
    {
        return producerRepository.save(producer);
    }

    public Producer updateProducer(Producer producer)
    {
        return producerRepository.save(producer);
    }

    public void deleteProducer(Long id)
    {
        producerRepository.deleteById(id);
    }
}

