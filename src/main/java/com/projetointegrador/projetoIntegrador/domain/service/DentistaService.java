package com.projetointegrador.projetoIntegrador.domain.service;

import com.projetointegrador.projetoIntegrador.domain.entity.Dentista;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service

public interface DentistaService {
    Dentista cadastrarDentista(Dentista dentista);

    List<Dentista> buscarTodosOsDentista();

    Dentista buscarDentistaPorId(UUID id);
    Dentista atualizarDentista(UUID id, Dentista dentistaAtualizado);
    Dentista excluir (UUID id);



}
