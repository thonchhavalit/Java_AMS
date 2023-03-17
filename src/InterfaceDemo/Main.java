package InterfaceDemo;

public class Main {
    public static void main(String[] args) {
        Banking creditAcc = new Banking(new CreditCard());
        creditAcc.depositMoney(1000);
        creditAcc.withdrawMoney(1000);
        System.out.println("Credit Balance: "+creditAcc.showBalance()+"$");

        Banking savingAcc = new Banking(new SavingAcc());
        savingAcc.depositMoney(1000);
        savingAcc.withdrawMoney(100);
        System.out.println("Saving Balance: "+savingAcc.showBalance()+"$");

    }
}
