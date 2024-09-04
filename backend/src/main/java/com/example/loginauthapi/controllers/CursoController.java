package com.example.loginauthapi.controllers;

import com.example.loginauthapi.domain.user.Curso;
import com.example.loginauthapi.dto.CursoDTO;
import com.example.loginauthapi.service.CursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
@RequiredArgsConstructor
public class CursoController {
    private final CursoService cursoService;

    @PostMapping
    public ResponseEntity<Curso> criarCurso(@RequestBody CursoDTO cursoDTO) {
        Curso curso = cursoService.criarCurso(cursoDTO);
        return ResponseEntity.ok(curso);
    }

    @GetMapping
    public ResponseEntity<List<Curso>> listarCursos() {
        List<Curso> cursos = cursoService.listarCursos();
        return ResponseEntity.ok(cursos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> obterCurso(@PathVariable String id) {
        Curso curso = cursoService.obterCurso(id);
        return ResponseEntity.ok(curso);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> atualizarCurso(@PathVariable String id, @RequestBody CursoDTO cursoDTO) {
        Curso curso = cursoService.atualizarCurso(id, cursoDTO);
        return ResponseEntity.ok(curso);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCurso(@PathVariable String id) {
        cursoService.deletarCurso(id);
        return ResponseEntity.noContent().build();
    }
}
