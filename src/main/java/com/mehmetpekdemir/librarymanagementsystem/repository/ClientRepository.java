package com.mehmetpekdemir.librarymanagementsystem.repository;

import com.mehmetpekdemir.librarymanagementsystem.entity.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClientRepository extends CrudRepository<Client, Integer> {
    Optional<Client> findClientByCemail(String cemail);
}
