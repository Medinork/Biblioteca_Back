package com.biblioteca.demo.entity;

public record RegisterDTO(
    String email,
    String password,
    UsuarioRoles role
) {}
