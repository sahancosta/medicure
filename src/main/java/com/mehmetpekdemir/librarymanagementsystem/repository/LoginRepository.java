package com.mehmetpekdemir.librarymanagementsystem.repository;

import com.mehmetpekdemir.librarymanagementsystem.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginRepository extends JpaRepository<Login,Integer> {
    Optional<Login> findByUemail(String uemail);
}
