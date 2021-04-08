package br.edu.ifal.gqso;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int op;
        double valor;
        Banco conta = new Banco();
        for(;;)
        {
            System.out.println(" 1 - Conferir Saldo\n 2 - Realizar Saque\n 3 - Realizar Deposito");
            op = sc.nextInt();

            if(op==1)
            {
                System.out.println("R$"+conta.saldo());
            }
            else if(op==2){
                System.out.println("Valor do Saque:");
                valor = sc.nextDouble();
                conta.saque(valor);
            }
            else if(op==3){
                System.out.println("Valor de Deposito:");
                valor = sc.nextDouble();
                conta.deposito(valor);
            }
            else{
                break;
                
            }

        }
        sc.close();


    }
}
