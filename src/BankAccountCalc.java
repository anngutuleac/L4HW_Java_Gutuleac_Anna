import java.util.Scanner;
public class BankAccountCalc {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        BankAccount accObj = new BankAccount(12345, 100);

        System.out.println("Выберите операцию, которую хотите совершить:");
        System.out.println("1. Поставить деньги на счет");
        System.out.println("2. Снять деньги со счета");
        System.out.println("3. Проверить баланс");
        char choise = scanner.next().charAt(0);
        switch (choise) {
            case '1':
                System.out.println("Введите сумму которую хотите добавить:");
                int additionalSum = scanner.nextInt();
                BankOperation.addMoney(additionalSum, accObj);
                System.out.println("Ваш баланс: " + accObj.balance);
                break;
            case '2':
                System.out.println("Введите сумму которую хотите снять:");
                int extractionSum = scanner.nextInt();
                BankOperation.extractMoney(extractionSum, accObj);
                System.out.println("Ваш баланс: " + accObj.balance);
                break;
            case '3':
                System.out.println("Ваш баланс: " + accObj.balance);
                break;
            default:
                System.out.println("Выбран неверный номер операции");
                break;
        }
    }
}

class BankAccount {
    int accNumber;
    double balance;

    public BankAccount(int accNumber, double balance) throws IllegalArgumentException {
        if (accNumber < 0) {
            throw new IllegalArgumentException("Номер счета должен быть неотрицательным!");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Баланс должен быть неотрицательным!");
        }
        this.accNumber = accNumber;
        this.balance = balance;
    }

}

class BankOperation {
    static void addMoney(int money, BankAccount account) {
        if (money > 0) {
            account.balance += money;
            System.out.println("Баланс был успешно пополнен на сумму: " + money);
        } else {
            System.out.println("Сумма пополнения должна быть больше нуля");
        }
    }

    static void extractMoney(int money, BankAccount account) {
        if (money <= 0) {
            System.out.println("Сумма снятия должна быть больше нуля");
        } else if (money <= account.balance) {
            account.balance -= money;
            System.out.println("Возьмите деньги");
        } else {
            System.out.println("На счету не достаточно средств для снятия этой суммы");
        }
    }
}
