package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoTest{
    private Banco conta;
    
    @BeforeEach
    public void setUp()
    {
        conta = new Banco();
    }
    // @Test
    // public void testSaldo() {
    //     assertEquals(, conta.saldo(),"não existe saldo negativo");
        
    // }
    @Test
    public void testSaque() {
        assertEquals(false, conta.saque(-100),"Não existe saque negativo");
        // assertEquals(true, conta.saque());
    }
    @Test
    public void testDeposito() {
        assertEquals(false, conta.deposito(-100),"Não existe saque negativo");
        
    }
}
