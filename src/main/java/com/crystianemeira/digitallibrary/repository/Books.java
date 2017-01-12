package com.crystianemeira.digitallibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crystianemeira.digitallibrary.model.Book;

public interface Books extends JpaRepository<Book, Long> {

}
