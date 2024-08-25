import java.util.Scanner;

public class ATM_Transaction{
    public static void  main (String[]args){
int balance = 5000 ,
 withdraw , deposit;
Scanner sc = new Scanner (System.in);
while (true) {
    System.out.println("Automated Teller Machine ");
    System.out.println("choose 1 for  check  Withdraw "); 
    System.out.println("choose 2 for check Deposit "); 
    System.out.println("choose 3 for  check Balance "); 
    int n = sc.nextInt();
    switch(n)
     {
    case 1 : 
    System.out.println("Enter money to be withdrawn :");
    withdraw = sc.nextInt();
    if (balance >= withdraw) {
        balance = balance -  withdraw ;
        System.out.println(" Please collect your money");
    }
    else{
        System.out.println("Insufficient Balance");
    }
    System.out.println("");
      break;
      case 2 : 
      System.out.println("Enter money to be deposited");
      deposit = sc.nextInt();
      balance = balance + deposit;
      System.out.println("Your money has been succesfully deposited ");
      System.out.println("");
      break;
      case 3:
      System.out.println("Balance :" + balance);
      System.out.println("");
      break;
      case 4 : 
      System.exit(0);
    }
}
}      
    }
