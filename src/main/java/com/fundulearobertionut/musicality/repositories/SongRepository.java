package com.fundulearobertionut.musicality.repositories;

import com.fundulearobertionut.musicality.models.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("SongRepository")
public interface SongRepository extends CrudRepository<Song, Long> {
}
