package com.thanhpt0105.springwebapp.repositories;

import com.thanhpt0105.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
