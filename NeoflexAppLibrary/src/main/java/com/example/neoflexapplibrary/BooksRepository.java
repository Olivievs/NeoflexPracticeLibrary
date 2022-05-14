package com.example.neoflexapplibrary;

import org.springframework.data.repository.CrudRepository;

import com.example.neoflexapplibrary.Books;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface BooksRepository extends CrudRepository<Books, Integer> {

}
