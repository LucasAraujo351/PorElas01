package com.example.loginauthapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InscricaoRepository extends JpaRepository<com.example.loginauthapi.domain.user.Inscricao, String> {
    Optional<com.example.loginauthapi.domain.user.Inscricao> findByUserIdAndCursoId(String userId, String cursoId); 
}
