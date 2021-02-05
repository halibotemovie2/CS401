public class Account
{
    private String name;
    private double balance;
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance=balance+amount;
//        balance += amount;
    }
    public void withdrawal(double amount) {
        if (balance >= amount)
            balance=balance-amount;
//            balance -= amount;
    }

    // transfers funds OUT of this account To another account
    public void transferTo( Account other, double amount ) {
        if (balance >= amount) {
            withdrawal(amount); // (attempt) withdrawal from this account
            other.deposit( amount ); // deposit into other account
        }
    }
    // else handle NSF condition }
    public String toString () {
        return name + " $" + balance;
    }
}

