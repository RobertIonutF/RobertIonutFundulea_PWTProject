package com.fundulearobertionut.musicality.controllers;
import com.fundulearobertionut.musicality.models.Instrument;
import com.fundulearobertionut.musicality.models.Musician;
import com.fundulearobertionut.musicality.services.InstrumentService;
import io.swagger.models.Response;
import org.apache.tomcat.util.http.parser.HttpParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InstrumentController {

    @Autowired
    private InstrumentService instrumentService;

    @GetMapping(path = "/instruments")
    public ResponseEntity<List<Instrument>> getAllInstruemnts()
    {
        return new ResponseEntity<List<Instrument>>(instrumentService.getAllInstruments(), HttpStatus.OK);
    }

    @GetMapping(path = "/instrument/{id}")
    public ResponseEntity<Instrument> getInstrument(Long id)
    {
        return new ResponseEntity<Instrument>(instrumentService.getInstrument(id), HttpStatus.OK);
    }

    @PostMapping(path = "/instrument")
    public ResponseEntity<Instrument> addInstrument(@RequestBody Instrument instrument)
    {
        return new ResponseEntity<Instrument>(instrumentService.addInstrument(instrument), HttpStatus.OK);
    }

    @PutMapping(path = "/instrument/{id}")
    public ResponseEntity<Instrument> updateInstrument(@RequestBody Instrument instrument, @PathVariable Long id)
    {
        return new ResponseEntity<Instrument>(instrumentService.updateInstrument(instrument), HttpStatus.OK);
    }

    @DeleteMapping(path ="/instrument/{id}")
    public ResponseEntity<Instrument> deleteInstrument(@PathVariable Long id)
    {
        instrumentService.deleteInstrument(id);
        return new ResponseEntity<Instrument>(HttpStatus.OK);
    }
}
