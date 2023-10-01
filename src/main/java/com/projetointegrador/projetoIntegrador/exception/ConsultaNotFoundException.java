package com.projetointegrador.projetoIntegrador.exception;

import java.util.UUID;

public class ConsultaNotFoundException extends RuntimeException{
    public ConsultaNotFoundException(UUID id)  {
        super("Consulta não encontrada".formatted(id));
    }
}
