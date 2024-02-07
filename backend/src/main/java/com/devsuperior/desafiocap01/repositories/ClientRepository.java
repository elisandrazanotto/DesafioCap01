package com.devsuperior.desafiocap01.repositories;

import com.devsuperior.desafiocap01.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
