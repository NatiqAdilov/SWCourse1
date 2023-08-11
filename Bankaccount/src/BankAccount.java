public class BankAccount {
    private AccNum accNum;
    private Balance balance;
    public BankAccount(AccNum accNum, Balance balance) {
        this.accNum = accNum;
        this.balance = balance;
    }
    public AccNum getAccNum() {
        return accNum;
    }
    public void setAccNum(AccNum accNum) {
        this.accNum = accNum;
    }
    public Balance getBalance() {
        return balance;
    }
    public void setBalance(Balance balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance.setAmount(balance.getAmount() + amount);
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && balance.getAmount() >= amount) {
            balance.setAmount(balance.getAmount() - amount);
        }
    }
}
