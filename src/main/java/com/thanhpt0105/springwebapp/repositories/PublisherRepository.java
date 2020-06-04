package com.thanhpt0105.springwebapp.repositories;

import com.thanhpt0105.springwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
