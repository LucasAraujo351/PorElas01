package com.example.loginauthapi.repositories;

import com.example.loginauthapi.domain.user.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, String> {
}
