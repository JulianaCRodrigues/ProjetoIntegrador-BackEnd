package com.projetointegrador.projetoIntegrador.domain.repository;

import com.projetointegrador.projetoIntegrador.domain.entity.Dentista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DentistaRepository extends JpaRepository<Dentista, UUID> {
}
