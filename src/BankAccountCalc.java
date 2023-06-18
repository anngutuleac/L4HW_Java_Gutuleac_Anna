public class BankAccountCalc {
    public static void main(String args[]) {
        BankAccount accObj = new BankAccount(111, 100);
        BankOperation.addMoney(25.5, accObj);
        System.out.println(accObj.balance);
        BankOperation.addMoney(0, accObj);
        System.out.println(accObj.balance);
        BankOperation.extractMoney(50, accObj);
        System.out.println(accObj.balance);
        BankOperation.extractMoney(0, accObj);
        System.out.println(accObj.balance);
        BankOperation.extractMoney(150, accObj);
        System.out.println(accObj.balance);
    }
}

class BankAccount {
    int accNumber;
    double balance;

    public BankAccount(int accNumber, double balance) {
        this.accNumber = accNumber;
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

}

class BankOperation {
    static void addMoney(double money, BankAccount account) {
        if (money > 0) {
            account.balance += money;
        } else {
            System.out.println("Сумма пополнения должна быть больше нуля");
        }
    }

    static void extractMoney(double money, BankAccount account) {
        if (money <= 0) {
            System.out.println("Сумма снятия должна быть больше нуля");
        } else if (money <= account.balance) {
            account.balance -= money;
        } else {
            System.out.println("На вашем счету не достаточно средств для снятия этой суммы");
        }
    }
}
