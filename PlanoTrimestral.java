package com.mycompany.alunos;

public class PlanoTrimestral extends Plano{
    public PlanoTrimestral(String nome,double preco,String descricao){
        super(nome,preco,descricao);
    }
    
    @Override
    public int duracaoMeses(){
        return 3;
    }
}
