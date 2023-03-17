package InterfaceDemo;

public class Banking {
    private Account account;

    public Banking(Account account){
        this.account = account;
    }
    public double showBalance(){
        return account.checkBalance();
    }
    public void withdrawMoney(double amount){
        account.withdraw(amount);
    }
    public void depositMoney(double amount){
        account.deposit(amount);
    }
}
