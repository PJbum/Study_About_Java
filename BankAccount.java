public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        setBalance(balance);
    }

    public BankAccount(String accountNumber, String accountHolder) {
        this(accountNumber, accountHolder,0.0);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0.0) {
            this.balance = balance;
        } else {
            System.out.println("음수방지");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("양수의 입금이어야합니다.");
        }
    }

    public void deposit(double amount, double bonus) {
        if (amount + bonus > 0) {
            balance += (amount + bonus);
        } else {
            System.out.println("양수의 입금이어야합니다.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("이름: " + accountHolder);
        System.out.println("잔액: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("040624", "Park", 100.0);
        account1.deposit(200.0);
        account1.deposit(100.0, 50.0);
        account1.displayAccountInfo();
    }
}
