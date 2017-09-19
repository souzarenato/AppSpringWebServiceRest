package com.ws.controller;

import com.ws.model.Usuario;
import com.ws.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.GET)
    public Usuario getUser(){
        return new Usuario();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Usuario> createUser(@RequestBody Usuario usuario){
        Usuario userCreated = usuarioService.create(usuario);
        return new ResponseEntity<>(userCreated, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/findall", method = RequestMethod.GET)
    public ResponseEntity<Collection<Usuario>> findUsers(){
        Collection<Usuario> findUsers = usuarioService.findAll();
        return new ResponseEntity<>(findUsers, HttpStatus.OK);
    }

}
