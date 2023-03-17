package InterfaceDemo;

public interface Account {
   public void withdraw(double amount);
   public void deposit(double amount);

   public double checkBalance();
   public double calculate();

//}
////class Main {
//   public static void main(String[] args) {
//      Banking creditAcc = new Banking(new CreditCard());
//      creditAcc.depositMoney(100);
//      System.out.println("Credit Balance: "+creditAcc.showBalance()+"$");
//
//      Banking depositAcc = new Banking(new SavingAcc());
//      depositAcc.depositMoney(99);
//      System.out.println("Saving Balance: "+depositAcc.showBalance()+"");
//
//   }
}
