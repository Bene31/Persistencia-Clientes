/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author terra
 */
public class Clientes {
    private int id;
    private String nome;
    private String apelido;
    private String telefone;
    private String celular;
    private String cep;
    private String categoria;
    private String desconto;

    public Clientes() {
    }

    public Clientes(int id, String nome, String apelido, String telefone, String celular, String cep, String categoria, String desconto) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.telefone = telefone;
        this.celular = celular;
        this.cep = cep;
        this.categoria = categoria;
        this.desconto = desconto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "Clientes{" + "id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", telefone=" + telefone + ", celular=" + celular + ", cep=" + cep + ", categoria=" + categoria + ", desconto=" + desconto + '}';
    }

}
