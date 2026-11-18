package com.mycompany.alunos;

public abstract class Plano {
    private String nome;
    private double preco;
    private String descricao;
    private static int totalPlanos;
    
    public Plano(String nome,double preco,String descricao){
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        totalPlanos++;
    }
    
    public abstract int duracaoMeses();
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public static int getTotalPlanos(){
        return totalPlanos;
    }
}
