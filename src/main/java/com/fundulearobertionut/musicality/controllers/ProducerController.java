package com.fundulearobertionut.musicality.controllers;

import com.fundulearobertionut.musicality.models.Producer;
import com.fundulearobertionut.musicality.services.ProducerService;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @GetMapping(path = "/producers")
    public ResponseEntity<List<Producer>> getAllProducers()
    {
        return new ResponseEntity<List<Producer>>(producerService.getAllProducers(), HttpStatus.OK);
    }

    @GetMapping(path = "/producer/{id}")
    public ResponseEntity<Producer> getProducer(@PathVariable Long id)
    {
        return new ResponseEntity<Producer>(producerService.getProducer(id), HttpStatus.OK);
    }

    @PostMapping(path = "/producer")
    public ResponseEntity<Producer> addProducer(@RequestBody Producer producer)
    {
        return new ResponseEntity<Producer>(producerService.addProducer(producer), HttpStatus.OK);
    }

    @PutMapping(path = "/producer/{id}")
    public ResponseEntity<Producer> updateProducer(@RequestBody Producer producer, @PathVariable Long id)
    {
        return new ResponseEntity<Producer>(producerService.updateProducer(producer), HttpStatus.OK);
    }

    @DeleteMapping(path = "/producer/{id}")
    public ResponseEntity<Producer> deleteProducer(@PathVariable Long id)
    {
        producerService.deleteProducer(id);
        return new ResponseEntity<Producer>(HttpStatus.OK);
    }
}
