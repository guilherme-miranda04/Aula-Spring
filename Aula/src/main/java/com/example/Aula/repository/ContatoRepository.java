package com.example.Aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Aula.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
