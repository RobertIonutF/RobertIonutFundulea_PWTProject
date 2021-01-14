package com.fundulearobertionut.musicality.repositories;

import com.fundulearobertionut.musicality.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("AlbumRepository")
public interface AlbumRepository extends JpaRepository<Album, Long> {

}
