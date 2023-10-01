package com.projetointegrador.projetoIntegrador.api.dto.response;


import com.projetointegrador.projetoIntegrador.domain.entity.Contato;
import com.projetointegrador.projetoIntegrador.domain.entity.Endereco;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class ClinicaOdontologicaResponse {

    private UUID id;
    private String nome;
    private String cpnj;
    private String razaoSocial;
    private String descricao;
    private Instant createdAt;
    private Instant updatedAt;
    private Endereco endereco;
    private Contato contato;

}
