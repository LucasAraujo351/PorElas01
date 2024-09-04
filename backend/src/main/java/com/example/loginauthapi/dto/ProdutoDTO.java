package com.example.loginauthapi.dto;

public record ProdutoDTO(
        String id,
        String nomeProduto,
        String produto,
        Double valor,
        String localProduto
) {}
