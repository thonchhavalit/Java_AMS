package InterfaceDemo;

public class BankingService {
    SavingAcc savingAcc;
    CreditCard creditCard;
    public BankingService(){
        savingAcc=new SavingAcc();
        creditCard=new CreditCard();
    }
    double checkBalance(){
        return savingAcc.checkBalance();
    }
    void setDeposite(double amount){
        savingAcc.deposit(amount);
    }
    void setWithdraw(double amount){
        savingAcc.withdraw(amount);
    }
}
