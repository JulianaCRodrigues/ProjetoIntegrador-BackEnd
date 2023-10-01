
package com.projetointegrador.projetoIntegrador.api.dto.response;


import java.time.LocalDate;
import java.util.UUID;

import com.projetointegrador.projetoIntegrador.domain.entity.Contato;
import com.projetointegrador.projetoIntegrador.domain.entity.Endereco;
import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PacienteResponse {

    private UUID id;
    private String nome;
    private LocalDate dataNascimento;
    private String sexo;
    private Contato contato;
    private Endereco endereco;



}
