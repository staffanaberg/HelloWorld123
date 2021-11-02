package bankAccount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {


    @Test
    public void testGetBalance() {

        //Arrange
        BankAccount bank = new BankAccount();

        //Act
        int actual = bank.getBalance();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);

    }


    @Test
    public void testIncreaseBalance() {

        //Arrange
        BankAccount bank = new BankAccount();

        //Act

        bank.increaseText("hej");
        bank.increaseText("hejsan svejsan");

        int actual = bank.getNbrOfCharacters();

        //Assert
        int expected = 17;

        assertEquals(expected, actual);

    }


    @Test
    public void testIsPositive() {

        //Arrange
        BankAccount bank = new BankAccount();

        //Act

        boolean actual = bank.isPositive(1000);


        //Assert
        boolean expected = true;

        assertEquals(expected, actual);

    }

    @Test
    public void testIsPositiveAtZero() {

        //Arrange
        BankAccount bank = new BankAccount();

        //Act

        boolean actual = bank.isPositive(0);


        //Assert
        boolean expected = false;

        assertEquals(expected, actual);

    }
    @Test
    public void testIsStop() {

        //Arrange
        BankAccount bank = new BankAccount();

        //Act

        boolean actual = bank.isStop("stop");

        if(bank.isStop("stop")) {
            System.out.println("it was stop");
        }

        //Assert
        boolean expected = true;

        assertEquals(expected, actual);

    }

    @Test
    public void testIsEmpty() {

        //Arrange
        BankAccount bank = new BankAccount();

        //Act

        boolean actual = bank.isEmpty();

        while(bank.isEmpty()) {
            System.out.println("No money today!");
        }

        //Assert
        boolean expected = true;

        assertEquals(expected, actual);

    }


}
