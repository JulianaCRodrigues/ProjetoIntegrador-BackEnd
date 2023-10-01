package com.projetointegrador.projetoIntegrador.api.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projetointegrador.projetoIntegrador.domain.entity.ClinicaOdontologica;
import com.projetointegrador.projetoIntegrador.domain.entity.Contato;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter

public class DentistaRequest {

    @NotBlank
    private String nome;
    @NotNull
    private LocalDate dataNascimento;
    @NotNull
    private String especialidade;
    @NotNull
    private String sexo;
    @NotNull
    private Contato contatoId;

    private ClinicaOdontologicaRequest clinicaOdontologica;
}
