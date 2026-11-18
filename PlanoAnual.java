package com.mycompany.alunos;

public class PlanoAnual extends Plano{
    public PlanoAnual(String nome,double preco,String descricao){
        super(nome,preco,descricao);
    }
    
    @Override
    public int duracaoMeses(){
        return 12;
    }
}
