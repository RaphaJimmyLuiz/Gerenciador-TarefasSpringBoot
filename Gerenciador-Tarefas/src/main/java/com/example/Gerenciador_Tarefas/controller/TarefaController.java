package com.example.Gerenciador_Tarefas.controller;

import com.example.Gerenciador_Tarefas.model.Tarefa;
import com.example.Gerenciador_Tarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
/**
 * Controlador para manipulação das operações HTTP com a entidade Tarefa.
 */
@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;
    /**
     * Lista todas as tarefas.
     *
     * @return uma lista de tarefas
     */
    @GetMapping
    public List<Tarefa> listarTodas() {
        return tarefaService.listarTodas();
    }
    /**
     * Obtém uma tarefa por seu ID.
     *
     * @param id o ID da tarefa
     * @return a ResponseEntity contendo a tarefa se encontrada, ou 404 se não encontrada
     */
    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> obterPorId(@PathVariable Long id) {
        Optional<Tarefa> tarefa = tarefaService.obterPorId(id);
        return tarefa.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    /**
     * Cria uma nova tarefa.
     *
     * @param tarefa a tarefa a ser criada
     * @return a tarefa criada
     */
    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return tarefaService.criar(tarefa);
    }
    /**
     * Deleta uma tarefa pelo seu ID.
     *
     * @param id o ID da tarefa a ser deletada
     * @return a ResponseEntity com status 204 se deletada, ou 404 se não encontrada
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        Optional<Tarefa> tarefa = tarefaService.obterPorId(id);
        if (tarefa.isPresent()) {
            tarefaService.deletar(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
