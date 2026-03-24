package com.Att.Gerenciamento.de.Projetos.repository;

import com.Att.Gerenciamento.de.Projetos.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}