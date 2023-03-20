package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

class MyAccount{
    int id;
    String ownerName;
    double balance;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}

public class ArrayListDemo {
    //acc id owner balance
    //add acc add edit remove show
    //show account information
    // 1 . descending order by account_id
    // 2.  ascending order by account_id
    // 3. descendinder order by balance
    public static void main(String[] args) {

        int option;
        List<MyAccount> accountList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1: Add account");
            System.out.println("2: Remove Account");
            System.out.println("3. Edit Account ");
            System.out.println("4. Show account information");
            System.out.println("5. Exit ");
            System.out.print("Choose option ( 1 - 5 ) : ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    // enter account information
                    // object add list
                    //accountList.add();
                    System.out.println("Enter your account information");
                    MyAccount acc = new MyAccount();
                    System.out.print("Input ID:");
                    acc.id = input.nextInt();
                    System.out.print("Name:");
                    input.nextLine();
                    acc.ownerName = input.nextLine();
                    System.out.print("Balance:");
                    acc.balance = (double) input.nextInt();

                    accountList.add(acc);

                    break;
                case 2:
                    System.out.println("Remove account by Id");
                    System.out.println("Enter Id for deleted");
                    int idRemove = input.nextInt();
                    System.out.println(idRemove);
                    boolean isFound = false;

                    for (int i=0 ; i<accountList.size();i++) {

                        if (accountList.get(i).id== idRemove) {
                            accountList.remove(i);
                            isFound = true;
                        }
                    }


                    if (!isFound) {
                        System.out.println("ID NOT FOUND!!");
                    }


                    break;
                case 3 :
                    System.out.println("Account Editing");
                    System.out.println("Input ID for update");
                    int idUpdate = input.nextInt();
                    boolean isCheck = false;
                    if(accountList.size()>0) {
                        for (MyAccount account1 : accountList) {


                            if (account1.id == idUpdate) {
                                System.out.println("Input new OwnerName ");
                                account1.ownerName = input.next();
                                System.out.println("Input new Balance ");
                                account1.balance = input.nextDouble();
                                isCheck = true;
                            }
                        }
                    }
                    if(!isCheck) System.out.println("NO DATA TO UPDATE!!");
                    break;
                case 4 :
                    int showOption ;
                    System.out.println("Show account information");
                    System.out.println("1. Ascending order (by ID )");
                    System.out.println("2. Descending order (by ID) ");
                    System.out.println("3. Descending order by balance ");

                    System.out.print("Choose show option : ");
                    showOption =  input.nextInt();
                    switch (showOption){

                        case 1:
                            System.out.println("Ascending order (by ID ");
                            Collections.sort(accountList, new Comparator<MyAccount>() {
                                @Override
                                public int compare(MyAccount o1, MyAccount o2) {
                                    return (Integer.compare(o1.id,o2.id));
                                }
                            });
                            for (MyAccount account1: accountList
                            ) {
                                System.out.println(account1);
                            }
                            break;
                        case 2:{
                            System.out.println("Descending order (by ID)");
                            Collections.sort(accountList, new Comparator<MyAccount>(){
                                @Override
                                public int compare(MyAccount o1, MyAccount o2) {
                                    return (Integer.compare(o2.id,o1.id));
                                }
                            });
                            for (MyAccount account1: accountList
                            ) {
                                System.out.println(account1);
                            }

                        }
                        break;
                        case 3:{
                            System.out.println("Descending order by balance");
                            Collections.sort(accountList, new Comparator<MyAccount>(){
                                @Override
                                public int compare(MyAccount o1, MyAccount o2) {
                                    return (Integer.compare((int) o2.balance,(int)o1.balance));
                                }
                            });
                            for (MyAccount account1: accountList
                            ) {
                                System.out.println(account1);
                            }

                        }
                        break;
                    }
                    break;
                case 5 :
                    System.out.println("Exit the program....!");break;

            }
        }while(option  !=5);

    }
}
