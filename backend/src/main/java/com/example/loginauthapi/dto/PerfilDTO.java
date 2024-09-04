package com.example.loginauthapi.dto;

public record PerfilDTO(
        String id,
        String nome,
        String dataNascimento,
        String email,
        String telefone
) {}
