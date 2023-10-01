package com.projetointegrador.projetoIntegrador.exception;

import java.util.UUID;

public class PacienteNotFoundException extends RuntimeException{
    public PacienteNotFoundException(UUID id)  {
        super("Paciente não encontrado".formatted(id));
    }
}
