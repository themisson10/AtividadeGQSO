package br.edu.ifal.gqso;


public class Banco {
    public class Saldoinsuficiente extends Exception {
        private static final long serialVersionUID = 1L;
    }
    private double saldo=0;

    double saldo(){
        return this.saldo;
    }
    boolean operacao(double valor,int op) throws Saldoinsuficiente
    {
        if(valor>0){
            if(op==1)
            {
                return deposito(valor);
            }
            else if(op==2){
                 return saque(valor);
            }
            return true;
            
        }
        else{
            System.out.println("Valor de operacao invalido");
            return false;
        }
        
    }
    boolean deposito(double valor)
    {
        if(valor<10){
            System.out.println("Valor minimo de deposito de R$10");
            return false;
        }
        else{
            System.out.println("Deposito Realizado com Sucesso");
            this.saldo+=valor;
            return true;
        }
    }
    boolean saque(double valor) throws Saldoinsuficiente
    {
        
        if(valor>this.saldo){
            throw new Saldoinsuficiente();
        }
        else{
            System.out.println("Saque Realizado com Sucesso");
            this.saldo-=valor;
            return true;
        }
        
        //public double deposito(double valor) throws ValorNegativo {
      //     if(valor < 0) {
    //         throw new ValorNegativo();
    //     }
    //     setSaldo(saldo() + valor);
    //     return saldo();
    // }
    
    }
    
}