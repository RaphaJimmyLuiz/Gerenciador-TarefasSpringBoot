package com.example.Gerenciador_Tarefas.repository;

import com.example.Gerenciador_Tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Repositório para a entidade Tarefa.
 */
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
