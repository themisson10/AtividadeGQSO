package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.ifal.gqso.Banco.Saldoinsuficiente;


public class BancoTest{
    private Banco conta;
    
    @BeforeEach
    public void setUp()
    {
        conta = new Banco();
    }
    
    @Test
    public void testOperacao() throws Exception{
        assertEquals(false, conta.operacao(-100,2), "Não existe saque negativo");
        assertEquals(false, conta.operacao(-100,1), "Não existe Deposito negativo");
    }
    @Test
    public void testDeposito() throws Exception{
        assertEquals(false, conta.operacao(9,1),"Minimo de deposito não atingido");
    }
    @Test
    public void testSaque() throws br.edu.ifal.gqso.Banco.Saldoinsuficiente{
        conta.operacao(1000, 1);
        // assertEquals(true, conta.operacao(200,2),"Saldo suficiente");
        assertThrows(Banco.Saldoinsuficiente.class, () -> conta.operacao(2000,2));
    }
}
