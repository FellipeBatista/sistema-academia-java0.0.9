package com.mycompany.alunos;

public class PlanoMensal extends Plano{
    public PlanoMensal(String nome,double preco,String descricao){
        super(nome,preco,descricao);
    }
    @Override
    public int duracaoMeses(){
        return 1;
    }
}
