package com.example.loginauthapi.repositories;

import com.example.loginauthapi.domain.user.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository <Curso,String>{
}
