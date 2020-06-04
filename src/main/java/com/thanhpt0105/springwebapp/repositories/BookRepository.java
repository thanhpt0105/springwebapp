package com.thanhpt0105.springwebapp.repositories;

import com.thanhpt0105.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
