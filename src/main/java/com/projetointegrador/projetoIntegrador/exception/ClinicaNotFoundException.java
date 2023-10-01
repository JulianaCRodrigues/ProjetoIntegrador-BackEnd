package com.projetointegrador.projetoIntegrador.exception;

import java.util.UUID;

public class ClinicaNotFoundException extends RuntimeException{
    public ClinicaNotFoundException(UUID id)  {
        super("Paciente não encontrado".formatted(id));
    }
}
