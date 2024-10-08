package com.example.loginauthapi.service;


import com.example.loginauthapi.domain.user.Curso;
import com.example.loginauthapi.domain.user.Inscricao;
import com.example.loginauthapi.domain.user.User;
import com.example.loginauthapi.repositories.CursoRepository;
import com.example.loginauthapi.repositories.InscricaoRepository;
import com.example.loginauthapi.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InscricaoService {
    private final InscricaoRepository inscricaoRepository;
    private final UserRepository userRepository;
    private final CursoRepository cursoRepository;

    public Inscricao inscreverNoCurso(String userId, String cursoId) { 
        Optional<User> user = userRepository.findById(userId);
        Optional<Curso> curso = cursoRepository.findById(cursoId);

        if (user.isPresent() && curso.isPresent()) {
            Inscricao inscricao = new Inscricao();
            inscricao.setUser(user.get());
            inscricao.setCurso(curso.get()); 
            return inscricaoRepository.save(inscricao);
        } else {
            throw new RuntimeException("Usuário ou Curso não encontrado");
        }
    }

    public void cancelarInscricao(String userId, String cursoId) {
        Optional<Inscricao> inscricao = inscricaoRepository.findByUserIdAndCursoId(userId, cursoId);

        inscricao.ifPresent(inscricaoRepository::delete);
    }
}
