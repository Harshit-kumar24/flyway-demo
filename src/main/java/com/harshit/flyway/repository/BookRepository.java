package com.harshit.flyway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harshit.flyway.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

}
