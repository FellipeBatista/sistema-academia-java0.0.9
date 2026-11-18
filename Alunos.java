package com.mycompany.alunos;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Alunos {
    private String nome;
    private int idade;
    private String senha;
    private double saldo;
    private String nomePlano;
    private LocalDateTime dataUltimoPagamento;
    private LocalDateTime dataVencimento;
    private boolean ativo;
    private static int totalAlunos;
    
    public Alunos(){
        
    };
    public Alunos(String nome,int idade,String senha){
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
        ativo = false;
        totalAlunos++;
    }
    
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public String getSenha(){
        return this.senha;
    }
    public boolean getAtivo(){
        return this.ativo;
    }
    public String getNomePlano(){
        return this.nomePlano;
    }
    public LocalDateTime getDataUltimoPagamento(){
        return this.dataUltimoPagamento;
    }
    public static int getTotalAlunos(){
        return totalAlunos;
    }
    public LocalDateTime getDataVencimento(){
        return this.dataVencimento;
    }
    public void cadastrarConta(ArrayList<Alunos> alunos){
        boolean ativo = true;
        while(ativo){
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Senha: ");
            String senha = scanner.nextLine();
            System.out.println("Confirmar senha: ");
            String confirmarSenha = scanner.nextLine();
            if(senha.equals(confirmarSenha)){
                alunos.add(new Alunos(nome,idade,senha));
                System.out.println("Cadastro confirmado para " + nome + ", Faça o login no próximo menu");
                ativo = false;
        } else{
                System.out.println("Senhas não são iguais, 1 - Tentar de novo | 2 - Sair do Cadastro");
                int opcao = scanner.nextInt();
                scanner.nextLine();
                switch(opcao){
                    case 1:
                        System.out.println("Voltando ao cadastro...");
                        break;
                    case 2:
                        System.out.println("Saindo do cadastro...");
                        ativo = false;
                        break;
                    default:
                        System.out.println("Opção inválida, nesse caso voltaremos ao cadastro");
                }
            }
        }
    }
    public Alunos login(ArrayList<Alunos> alunos){
        boolean ativo = true;
        boolean confirmar = false;
        while(ativo){
            System.out.println("Nome da conta: ");
            String nome = scanner.nextLine();
            System.out.println("Senha: ");
            String senha = scanner.nextLine();
            for(Alunos a: alunos){
                if(a.getNome().equals(nome) && a.getSenha().equals(senha)){
                    System.out.println("Login realizado com sucesso!");
                    ativo = false;
                    confirmar = true;
                    return a;
            }
                }
        if(confirmar == false){
                    System.out.println("Nome e/ou senha não foram encontrados, 1 - Tentar de novo | 2 - Sair do Login");
                    int opcao = scanner.nextInt();
                    scanner.nextLine();
                    switch(opcao){
                        case 1:
                           System.out.println("Voltando ao login...");
                           break;
                        case 2:
                            System.out.println("Saindo do login...");
                            ativo = false;
                            break;
                        default:
                            System.out.println("Opção inválida, nesse caso o login será retomado");
    }
    }
    }
        return null;
    }
    public void adicionarSaldo(){
                boolean ativo = true;
                while(ativo){
                    System.out.println("Digite o saldo em R$ que você quer depositar: ");
                    double saldo = scanner.nextDouble();
                    scanner.nextLine();
                    if(this.getIdade() >= 14){
                        this.saldo += saldo;
                        LocalDateTime data_pagamento = LocalDateTime.now();
                        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
                        String data_br = formatador.format(data_pagamento);
                        System.out.println("O Aluno "+ this.getNome() + " depositou R$" + saldo + " na data "+ data_br);
                        ativo = false;
                }   else if(saldo < 0){
                    System.out.println("Saldo é menor que 0, 1 - Tentar de novo | 2 - Sair de adicionar saldo");
                    int opcao = scanner.nextInt();
                    scanner.nextLine();
                    switch(opcao){
                        case 1:
                            System.out.println("Voltando a adicionar saldo...");
                            break;
                        case 2:
                            System.out.println("Saindo de adicionar saldo...");
                            ativo = false;
                            break;
                        default:
                            System.out.println("Opção inválida, voltando ao menu de adicionar saldo");
                            break;
                    }
                }
                    else{
                        System.out.println("Idade muito baixa pra treinar, depósito recusado");
                        ativo = false;
                }
                }
        }
    public void ativarPlano(){
        this.ativo = true;
    }
    public void desativarPlano(){
        this.ativo = false;
    }
    public void setNomePlano(String nomePlano){
        this.nomePlano = nomePlano;
    }
    public void setDataUltimoPagamento(LocalDateTime dataUltimoPagamento){
        this.dataUltimoPagamento = dataUltimoPagamento;
    }
    public void setDataVencimento(LocalDateTime dataVencimento){
        this.dataVencimento = dataVencimento;
    }
    
    public void consultaConta(){
        System.out.println("Nome: " + this.getNome() + " | Idade: " + this.getIdade() + " | Saldo: R$" + this.getSaldo() + " | Plano Ativo: " + this.getAtivo() + " | Nome do Plano Atual: " + this.getNomePlano() + " | Data do último pagamento: " + this.getDataUltimoPagamento() + " | Data de vencimento do plano: " + this.getDataVencimento());
    }
    public void consultaPlanos(ArrayList<Plano> plano){
        for(Plano p : plano){
            System.out.println("Nome: " + p.getNome() + " | Valor: " + p.getPreco() + " | Duração do Plano(em meses) " + p.duracaoMeses() + " | Descrição do Plano: " + p.getDescricao());
    }
    }
        
    public void pagar(ArrayList<Plano> plano){
        boolean ativo = true;
        boolean confirmar = false;
        while(ativo){
        System.out.println("Opções de planos: ");
        this.consultaPlanos(plano);
        System.out.println("Escolha o plano pelo nome: ");
        String nomePlano = scanner.nextLine();
        for(Plano p: plano){
            if(p.getNome().equalsIgnoreCase(nomePlano)){
                if(this.getSaldo() >= p.getPreco() && this.getIdade() >= 14){
                    this.nomePlano = p.getNome();
                    this.saldo -= p.getPreco();
                    this.ativarPlano();
                    confirmar = true;
                    LocalDateTime data_pagamento = LocalDateTime.now();
                    LocalDateTime data_vencimento = data_pagamento.plusMonths(p.duracaoMeses());
                    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
                    String data_pagamento_br = formatador.format(data_pagamento);
                    String data_vencimento_br = formatador.format(data_vencimento);
                    this.setDataUltimoPagamento(data_pagamento);
                    this.setDataVencimento(data_vencimento);
                    System.out.println("O Aluno " + this.getNome() + " pagou R$" + p.getPreco() +  " pelo plano " + p.getNome() + " na data " + data_pagamento_br + " sua data de vencimento é " + data_vencimento_br);
                    ativo = false;
                    } else{
                         System.out.println("Você não tem saldo suficiente para comprar o plano, deposite mais dinheiro");
                         ativo = false;
                    }
        }
        }
        if(confirmar == false){
                System.out.println("Nome não encontrado no banco de dados, 1 - Tentar de novo | 2 - Sair do pagamento");
                int opcao = scanner.nextInt();
                scanner.nextLine();
                switch(opcao){
                    case 1:
                        System.out.println("Voltando...");
                        break;
                    case 2:
                        System.out.println("Saindo...");
                        ativo = false;
                        break;
                    default:
                        System.out.println("Opção inválida, voltando pra o pagamento");
                }
            }
        }
    }
    static Scanner scanner = new Scanner(System.in);
    
    public boolean menu(boolean menuAtivo,boolean programaAtivo,ArrayList<Alunos> alunos,ArrayList<Plano> plano){
        while(menuAtivo){
            System.out.println("---Academia---");
            System.out.println("1 - Consultar Conta | 2 - Consultar Planos | 3 - Adicionar Saldo | 4 - Escolher e Pagar Plano | 5 - Sair da Conta | 6 - Sair do Programa");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch(opcao){
                case 1:
                    consultaConta();
                    break;
                case 2:
                    consultaPlanos(plano);
                    break;
                case 3:
                    adicionarSaldo();
                    break;
                case 4:
                    pagar(plano);
                    break;
                case 5:
                    System.out.println("Saindo da conta...");
                    menuAtivo = false;
                    break;
                case 6:
                    System.out.println("Saindo do Programa...");
                    menuAtivo = false;
                    return false;
                default:
                    System.out.println("Opção inválida, voltando as opções do menu...");
        }
    }
        return true;
    }
    public static void main(String[] args){
        boolean programaAtivo = true;
        boolean menuAtivo = false;
        boolean ativo = true;
        ArrayList<Alunos> alunos = new ArrayList<>();
        ArrayList<Plano> plano = new ArrayList<>();
        Alunos a = new Alunos();
        plano.add(new PlanoMensal("Plano Plus",99.90,"Acompanhante gratuito 5x ao mês"));
        plano.add(new PlanoTrimestral("Plano Infinity",289.90,"Acompanhante gratuito 10x ao mês e horário livre"));
        plano.add(new PlanoAnual("Plano MegaPlus",999.90,"Acompanhantes ilimitados e acesso a todas as unidades do brasil"));
        while(ativo){
            Alunos aluno = null;
            System.out.println("---Cadastro e Login---");
            System.out.println("1 - Cadastro | 2 - Login");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch(opcao){
                case 1:
                    a.cadastrarConta(alunos);
                    break;
                case 2:
                    aluno = a.login(alunos);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            if(aluno != null){
                menuAtivo = true;
            } else{
                menuAtivo = false;
            }
            if(menuAtivo == true){
                programaAtivo = aluno.menu(menuAtivo, programaAtivo, alunos, plano);
            }
            if(programaAtivo == false){
                ativo = false;
            }
        }
        scanner.close();
    }
    }

