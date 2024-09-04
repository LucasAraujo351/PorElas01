package com.example.loginauthapi.service;


import com.example.loginauthapi.domain.user.Perfil;
import com.example.loginauthapi.dto.PerfilDTO;
import com.example.loginauthapi.repositories.PerfilRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PerfilService {
    private final PerfilRepository perfilRepository;

    public Perfil criarPerfil(PerfilDTO perfilDTO) {
        Perfil perfil = new Perfil();
        perfil.setNome(perfilDTO.nome());
        perfil.setDataNascimento(perfilDTO.dataNascimento());
        perfil.setEmail(perfilDTO.email());
        perfil.setTelefone(perfilDTO.telefone());
        return perfilRepository.save(perfil);
    }

    public List<Perfil> listarPerfis() {
        return perfilRepository.findAll();
    }

    public Perfil obterPerfil(String id) {
        return perfilRepository.findById(id).orElseThrow(() -> new RuntimeException("Perfil não encontrado"));
    }

    public Perfil atualizarPerfil(String id, PerfilDTO perfilDTO) {
        Perfil perfil = obterPerfil(id);
        perfil.setNome(perfilDTO.nome());
        perfil.setDataNascimento(perfilDTO.dataNascimento());
        perfil.setEmail(perfilDTO.email());
        perfil.setTelefone(perfilDTO.telefone());
        return perfilRepository.save(perfil);
    }

    public void deletarPerfil(String id) {
        perfilRepository.deleteById(id);
    }
}
