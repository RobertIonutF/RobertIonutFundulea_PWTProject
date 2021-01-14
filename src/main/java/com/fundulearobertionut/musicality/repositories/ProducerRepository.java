package com.fundulearobertionut.musicality.repositories;

import com.fundulearobertionut.musicality.models.Producer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("ProducerRepository")
public interface ProducerRepository extends CrudRepository<Producer, Long> {
}
