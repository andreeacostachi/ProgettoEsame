package com.perro.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perro.entities.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

}// Fine Interface