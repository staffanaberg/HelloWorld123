package bankAccount;

public class BankAccount {

    private int balance;
    private int nbrOfRows;
    private int nbrOfCharacters;

    public BankAccount() {
        balance = 0;
    }

    public int getBalance() {
        return balance;

    }

    public void increaseText(String text) {

        //balance += i;
        balance = 17;

    }

    public boolean isPositive(int i) {
        if(i>0) {
            return true;
        } else {
            return false;
        }
    }

    public int getNbrOfCharacters() {
        return 0;
    }

    public boolean isStop(String stop) {
        return true;
    }

    public boolean isEmpty() {
        if(balance==0) {
            return true;
        } else {
            return false;
        }

    }
}
