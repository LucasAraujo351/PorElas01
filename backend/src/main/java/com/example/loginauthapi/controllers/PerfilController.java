package com.example.loginauthapi.controllers;


import com.example.loginauthapi.domain.user.Perfil;
import com.example.loginauthapi.dto.PerfilDTO;
import com.example.loginauthapi.service.PerfilService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfis")
@RequiredArgsConstructor
public class PerfilController {
    private final PerfilService perfilService;

    @PostMapping
    public ResponseEntity<Perfil> criarPerfil(@RequestBody PerfilDTO perfilDTO) {
        Perfil perfil = perfilService.criarPerfil(perfilDTO);
        return ResponseEntity.ok(perfil);
    }

    @GetMapping
    public ResponseEntity<List<Perfil>> listarPerfis() {
        List<Perfil> perfis = perfilService.listarPerfis();
        return ResponseEntity.ok(perfis);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Perfil> obterPerfil(@PathVariable String id) {
        Perfil perfil = perfilService.obterPerfil(id);
        return ResponseEntity.ok(perfil);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Perfil> atualizarPerfil(@PathVariable String id, @RequestBody PerfilDTO perfilDTO) {
        Perfil perfil = perfilService.atualizarPerfil(id, perfilDTO);
        return ResponseEntity.ok(perfil);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPerfil(@PathVariable String id) {
        perfilService.deletarPerfil(id);
        return ResponseEntity.noContent().build();
    }
}
