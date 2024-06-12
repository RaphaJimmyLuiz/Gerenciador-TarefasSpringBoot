package com.example.Gerenciador_Tarefas.service;

import com.example.Gerenciador_Tarefas.model.Tarefa;
import com.example.Gerenciador_Tarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * Serviço para manipulação das operações com a entidade Tarefa.
 */
@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;
    /**
     * Lista todas as tarefas.
     *
     * @return uma lista de tarefas
     */
    public List<Tarefa> listarTodas() {
        return tarefaRepository.findAll();
    }
    /**
     * Obtém uma tarefa por seu ID.
     *
     * @param id o ID da tarefa
     * @return uma Optional contendo a tarefa se encontrada, ou vazio se não encontrada
     */
    public Optional<Tarefa> obterPorId(Long id) {
        return tarefaRepository.findById(id);
    }
    /**
     * Cria uma nova tarefa.
     *
     * @param tarefa a tarefa a ser criada
     * @return a tarefa criada
     */
    public Tarefa criar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }
    /**
     * Deleta uma tarefa pelo seu ID.
     *
     * @param id o ID da tarefa a ser deletada
     */
    public void deletar(Long id) {
        tarefaRepository.deleteById(id);
    }
}
