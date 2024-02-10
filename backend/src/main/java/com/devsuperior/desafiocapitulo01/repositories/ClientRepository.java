package com.devsuperior.desafiocapitulo01.repositories;

import com.devsuperior.desafiocapitulo01.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
