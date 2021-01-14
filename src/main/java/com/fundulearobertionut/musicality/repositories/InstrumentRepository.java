package com.fundulearobertionut.musicality.repositories;

import com.fundulearobertionut.musicality.models.Instrument;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrumentRepository extends CrudRepository<Instrument, Long> {
}
