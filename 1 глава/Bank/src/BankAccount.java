/**
 * Акаунт банка представляющий услуги клиенту.
 * @author imxo
 */
public class BankAccount {
    
    private double balance;// Баланс счёта.

    public BankAccount(double balance) {// Конструктор.
        this.balance = balance;
    }
    
    public void deposit(double amout){
        balance += amout;
    }
    
    public void withdraw(double amout){
        balance -= amout;
    }
    
    public void display(){
        System.out.println("Balance: " + balance);
    }
}
