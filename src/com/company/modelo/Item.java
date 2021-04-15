package com.company.modelo;

import com.company.dto.ItemDTO;

import java.util.UUID;

public class Item {
    private String descricao;
    private double valor;
    private String nome;
    private Categoria categoria;
    private Prioridade prioridade;
    private UUID ID;

    public Item(ItemDTO itemDTO, UUID id){
        setDescricao(itemDTO.getDescricao());
        setValor(Double.parseDouble(itemDTO.getValor()));
        setNome(itemDTO.getNome());
        setCategoria(Categoria.procurarCategoria(itemDTO.getCategoria()));
        setPrioridade(Prioridade.procurarPrioridade(itemDTO.getPrioridade()));
        this.ID = id;
    }

    public Item(ItemDTO itemDTO) {
        setDescricao(itemDTO.getDescricao());
        setValor(Double.parseDouble(itemDTO.getValor()));
        setNome(itemDTO.getNome());
        setCategoria(Categoria.procurarCategoria(itemDTO.getCategoria()));
        setPrioridade(Prioridade.procurarPrioridade(itemDTO.getPrioridade()));
        this.ID = UUID.randomUUID();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public UUID getID() {
        return ID;
    }

    @Override
    public String toString() {
        return
                "Descricao= " + descricao +
                        ", Valor= " + valor +
                        ", Nome= " + nome +
                        ", Categoria= " + categoria +
                        ", Prioridade= " + prioridade +
                        ", ID= " + ID;
    }
}
