package com.example.Gerenciador_Tarefas.model;


import jakarta.persistence.*;
import java.time.LocalDate;
/**
 * Entidade que representa uma tarefa.
 */
@Entity
public class Tarefa {
    /**
     * Identificador único da tarefa.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Título da tarefa.
     */
    private String titulo;
    /**
     * Descrição detalhada da tarefa.
     */
    private String descricao;
    /**
     * Data de conclusão ou de agendamento da tarefa.
     */
    private LocalDate data;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}

