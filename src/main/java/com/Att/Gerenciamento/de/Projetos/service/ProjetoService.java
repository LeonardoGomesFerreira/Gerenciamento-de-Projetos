package com.Att.Gerenciamento.de.Projetos.service;

import com.Att.Gerenciamento.de.Projetos.entity.Projeto;
import com.Att.Gerenciamento.de.Projetos.repository.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    private final ProjetoRepository repository;

    public ProjetoService(ProjetoRepository repository) {
        this.repository = repository;
    }

    public Projeto salvar(Projeto projeto) {
        return repository.save(projeto);
    }

    public List<Projeto> listarTodos() {
        return repository.findAll();
    }

    public Optional<Projeto> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}