package br.edu.ifal.gqso;

public class Banco {
    private double saldo=0;

    double saldo(){
        return this.saldo;
    }
    void deposito(double valor)
    {
        if(valor<=0){
            System.out.println("Valor de deposito invalido");
        }
        else{
            System.out.println("Deposito Realizado com Sucesso");
            this.saldo+=valor;
        }
    }
    void saque(double valor)
    {
        if(valor>this.saldo)
        {
            System.out.println("Saldo insuficiente");
        }
        else{
            System.out.println("Saque Realizado com Sucesso");
            this.saldo-=valor;
        }

    }
    
}