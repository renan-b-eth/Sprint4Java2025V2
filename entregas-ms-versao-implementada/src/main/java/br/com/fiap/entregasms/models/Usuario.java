package com.fiap.odontoprev.odontoprev.model;

import com.fiap.odontoprev.odontoprev.role.UsuarioRole;
import lombok.Data;

import java.util.UUID;

@Data
public class Usuario {
    private String idUsuario;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String senha;
    private UsuarioRole role;

    public Usuario() {
        this.idUsuario = UUID.randomUUID().toString();
    }


}
