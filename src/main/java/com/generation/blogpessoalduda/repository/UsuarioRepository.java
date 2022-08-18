package com.generation.blogpessoalduda.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoalduda.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository <UsuarioModel, Long>{
	
	public Optional<UsuarioModel> findByUsuario(String usuario);
	
	public List <UsuarioModel> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
