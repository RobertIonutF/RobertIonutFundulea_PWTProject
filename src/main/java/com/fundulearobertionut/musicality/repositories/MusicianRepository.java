package com.fundulearobertionut.musicality.repositories;

import com.fundulearobertionut.musicality.models.Musician;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("MusicianRepository")
public interface MusicianRepository extends CrudRepository<Musician, Long> {

}
