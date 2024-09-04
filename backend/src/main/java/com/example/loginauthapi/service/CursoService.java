package com.example.loginauthapi.service;


import com.example.loginauthapi.domain.user.Curso;
import com.example.loginauthapi.dto.CursoDTO;
import com.example.loginauthapi.repositories.CursoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoService {
    private final CursoRepository cursoRepository;

    public Curso criarCurso(CursoDTO cursoDTO) {
        Curso curso = new Curso();
        curso.setTemaCurso(cursoDTO.temaCurso());
        curso.setHorasCurso(cursoDTO.horasCurso());
        return cursoRepository.save(curso);
    }

    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    public Curso obterCurso(String id) {
        return cursoRepository.findById(id).orElseThrow(() -> new RuntimeException("Curso não encontrado"));
    }

    public Curso atualizarCurso(String id, CursoDTO cursoDTO) {
        Curso curso = obterCurso(id);
        curso.setTemaCurso(cursoDTO.temaCurso());
        curso.setHorasCurso(cursoDTO.horasCurso());
        return cursoRepository.save(curso);
    }

    public void deletarCurso(String id) {
        cursoRepository.deleteById(id);
    }
}
