package com.fiap.odontoprev.odontoprev.mapper;

import com.fiap.odontoprev.odontoprev.model.Usuario;
import com.fiap.odontoprev.odontoprev.request.UsuarioCreateRequest;
import com.fiap.odontoprev.odontoprev.request.UsuarioLoginRequest;
import com.fiap.odontoprev.odontoprev.request.UsuarioUpdateRequest;
import org.springframework.stereotype.Component;

@Component
public class UsuarioDtoMapper {

    public Usuario converterUsuarioDto(UsuarioCreateRequest usuarioCreateRequest) {
        Usuario usuario = new Usuario();

        usuario.setNome(usuarioCreateRequest.getNome());
        usuario.setCpf(usuarioCreateRequest.getCpf());
        usuario.setDataNascimento(usuarioCreateRequest.getDataNascimento());
        usuario.setSenha(usuarioCreateRequest.getSenha());
        usuario.setRole(usuarioCreateRequest.getRole());
        return usuario;
    }

    public Usuario converterUsuarioUpdateDto(UsuarioUpdateRequest usuarioUpdateRequest) {
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioUpdateRequest.getNome());
        usuario.setSenha(usuarioUpdateRequest.getSenha());
        return usuario;
    }


    public Usuario converterUsuarioLoginDto(UsuarioLoginRequest usuarioLoginRequest) {
        Usuario usuario = new Usuario();
        usuario.setCpf(usuarioLoginRequest.getCpf());
        usuario.setSenha(usuarioLoginRequest.getSenha());
        return usuario;
    }
}

