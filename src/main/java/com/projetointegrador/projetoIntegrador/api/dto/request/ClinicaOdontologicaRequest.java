package com.projetointegrador.projetoIntegrador.api.dto.request;

import com.projetointegrador.projetoIntegrador.domain.entity.Contato;
import com.projetointegrador.projetoIntegrador.domain.entity.Endereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CNPJ;


@Getter
@Setter
public class ClinicaOdontologicaRequest {

    @NotBlank
    private String nome;
    @CNPJ
    private String cpnj;
    @NotNull
    private String razaoSocial;
    @NotNull
    private String descricao;
    @NotNull
    private Endereco endereco;
    @NotNull
    private Contato contato;
}
