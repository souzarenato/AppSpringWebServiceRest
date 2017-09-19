package com.ws.service;

import com.ws.model.Usuario;
import com.ws.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario create(Usuario user){
        return usuarioRepository.save(user);
    }

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }
}
