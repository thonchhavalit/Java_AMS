package InterfaceDemo;

public class CreditCard implements Account{
    private float balance;
    private float interestRate;
    private double limitCard;
    CreditCard(){
        balance =10;
        interestRate =30;
        limitCard =100;
    }
    @Override
    public void withdraw(double amount) {
       if (amount<=limitCard){
           if (balance<=amount){
               balance-=amount;
               //balance = balance - amount
           }
           else{
               System.out.println("Insufficient balance!!");
           }
       }
       else {
           System.out.println("Amount exceed limit card");
       }


    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
        //balance = balance + amount
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
