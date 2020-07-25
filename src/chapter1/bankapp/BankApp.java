package chapter1.bankapp;

/**
 * Демонстрация базового синстаксиса ООП.
 *
 * @author Ломовской К.Ю.
 * @since 25.07.2020
 */
public class BankApp {

    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount(100.00);  // Создание счёта

        System.out.print("Before transactions, ");
        ba1.display();                                      // Вывод баланса.

        ba1.deposit(74.35);                          // Внесение средств.
        ba1.withdraw(20.00);                         // Снятие средств.

        System.out.print("After transactions, ");
        ba1.display();                                      // Вывод баланса.
    }
}
