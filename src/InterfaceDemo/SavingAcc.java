package InterfaceDemo;

class SavingAcc implements Account{
    private double balance;
    private float interestRate;
    SavingAcc(){
        balance =0;
        interestRate =50;
    }
    @Override
    public void withdraw(double amount) {
        if (balance<=amount){
            balance-=amount;
        }
        else {
            System.out.println("Your amount is not enough!");
        }
    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public double calculate() {

        return balance *(interestRate/100);
    }
}
