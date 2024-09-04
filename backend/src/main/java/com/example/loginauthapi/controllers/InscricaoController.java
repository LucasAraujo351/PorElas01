package com.example.loginauthapi.controllers;


import com.example.loginauthapi.domain.user.Inscricao;
import com.example.loginauthapi.service.InscricaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inscricoes")
@RequiredArgsConstructor
public class InscricaoController {
    private final InscricaoService inscricaoService;

    @PostMapping("/inscrever")
    public ResponseEntity<Inscricao> inscreverNoCurso(@RequestParam String userId, @RequestParam String cursoId) {
        try {
            Inscricao inscricao = inscricaoService.inscreverNoCurso(userId, cursoId);
            return ResponseEntity.ok(inscricao);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/cancelar")
    public ResponseEntity<Void> cancelarInscricao(@RequestParam String userId, @RequestParam String cursoId) {
        try {
            inscricaoService.cancelarInscricao(userId, cursoId);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
