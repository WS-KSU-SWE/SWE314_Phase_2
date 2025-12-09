package swe314_project_phase2;


// note: this class is missing the transaction list
public class Account {
	
    private long accountNumber;
    private double balance;
    private short cvv;
    private String expirationDate;
    private AccountType type;

    public Account(long accountNumber, short cvv, String expirationDate, AccountType type) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.type = type;
    }

    public boolean transfer(double amount, Account receiverAccount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            receiverAccount.balance += amount;
            return true;
        }
        return false;
    }

    public long getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public short getCvv() { return cvv; }
    public String getExpirationDate() { return expirationDate; }
    public AccountType getType() { return type; }

    public void setBalance(double balance) { this.balance = balance; }
	
}
