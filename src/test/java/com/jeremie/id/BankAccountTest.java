package test.java.com.jeremie.id;

import main.java.com.jeremie.id.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private  BankAccount ba;

    @BeforeEach
    public void setUp(){
        ba = new BankAccount(500);
    }

    @Test
    public void test_deposit(){
        ba.deposit(100);
//        assertEquals(100, ba.balance);
        assertEquals(100, ba.getBalance());
    }

    @Test
    public void  test_withdraw(){
        ba.withdraw(40);
        //        assertEquals(60, ba.balance);
        assertEquals(60, ba.getBalance());
    }

    @Test
    public void test_withdraw_maxValue(){
        ba.withdraw(150);
        assertEquals(400, ba.getBalance());
    }

    @Test
    public void test_deposit_negativeValue(){
        NumberFormatException thrown = assertThrows(
                NumberFormatException.class,
                () -> ba.deposit(-100)
        );
        assertTrue(thrown.getMessage().contains("Negative"));
    }
}