package com.app.ubox.republica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ubox.republica.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
