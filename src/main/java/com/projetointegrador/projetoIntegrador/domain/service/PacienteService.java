package com.projetointegrador.projetoIntegrador.domain.service;

import com.projetointegrador.projetoIntegrador.domain.entity.Dentista;
import com.projetointegrador.projetoIntegrador.domain.entity.Paciente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;
@Service

public interface PacienteService {

    Paciente cadastrarPaciente(Paciente paciente);

    List<Paciente> buscarTodosOsPaciente();


    Paciente buscarPacientePorId(UUID id);


    Paciente atualizarPaciente(UUID id, Paciente pacienteAtualizado);

    void excluir(UUID id);




}
