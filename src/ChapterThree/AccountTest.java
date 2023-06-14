package ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account account;

    @BeforeEach
    public void startWith() {
        account = new Account("Michael", "09069227424");
    }
    @Test public void depositMoneyTest(){
        account.deposit(2_000);
        assertEquals(2000, account.getBalance());
    }
    @Test public void depositNegativeValueTest(){
        account.deposit(2_000);
        account.deposit(-2_000);
        assertEquals(2000, account.getBalance());
    }
    @Test public void withdrawMoneyTest(){
        account.deposit(2_000);
        account.setPin("9910");
        account.withdraw("9910", 1_000);
        assertEquals(1000, account.getBalance());
    }
    @Test public void withdrawNegativeValueTest() {
        account.deposit(2_000);
        account.setPin("9910");
        account.withdraw("9910", -1000);
        assertEquals(2000, account.getBalance());
    }
}
