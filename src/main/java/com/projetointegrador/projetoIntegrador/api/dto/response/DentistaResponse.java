package com.projetointegrador.projetoIntegrador.api.dto.response;

import com.projetointegrador.projetoIntegrador.domain.entity.Contato;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter

public class DentistaResponse {
    private UUID id;
    private String nome;
    private LocalDate dataNascimento;
    private String especialidade;
    private String sexo;
    private Contato contato;


    public DentistaResponse(UUID id, String nome, LocalDate dataNascimento, String especialidade, String sexo, Contato contato) {
    }
}
