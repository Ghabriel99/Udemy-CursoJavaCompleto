package bank;
import app.Account;
import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      Account account;

      System.out.println("Enter the account number: ");
      int number = sc.nextInt();

      System.out.println("Enter account holder: ");
      sc.nextLine();
      String holder = sc.nextLine();  

      System.out.println("Is there an initial deposity (y/n)? ");
      char response = sc.next().charAt(0);

      if(response == 'y'){
         System.out.println("Enter initial deposity value: ");
         double initialDeposity = sc.nextDouble();
         account = new Account(number,holder,initialDeposity);
      } else { 
         account = new Account(number,holder); //cria a conta com o construtor de dois argumentos
      }

      System.out.println();
      System.out.println("Account data: ");
      System.out.println(account);

      System.out.println();
      System.out.print("Enter a deposity value: ");
   
      double depositValue = sc.nextDouble();
      account.deposit(depositValue);
      
      System.out.println("Updated account data: ");
      System.out.print(account);
      //
      System.out.println();
      System.out.print("Enter a withdraw value: ");
   
      double withdrawValue = sc.nextDouble();
      account.withdraw(withdrawValue);
      
      System.out.println("Updated account data: ");
      System.out.print(account);

      sc.close();
   };
};