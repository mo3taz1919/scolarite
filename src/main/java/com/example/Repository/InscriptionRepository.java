package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entites.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {

}
