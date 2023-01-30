package app;

public class Account {
   
   private int number;
   private String holder;
   private double balance;

   public Account(int number, String holder) {
      this.number = number;
      this.holder = holder;

   }
   public Account(int number, String holder, double initialDeposity) {
      this.number = number;
      this.holder = holder;
      deposit(initialDeposity);  //chama o método de depósito para o depósito inicial
   }

   public int getNumber() { //getter do number
      return number;
   }

   public String getHolder() { //getter do dono da conta
      return holder;
   }

   public void setHolder(String holder) { //setter do dono da conta
      this.holder = holder;
   }

   public double getBalance() { // getter do saldo
      return balance;
   }

   public void deposit(double amount) { //cria o depósito e adiciona o valor ao saldo.
      balance += amount;
   }
   
   public void withdraw(double amount) { //cria o saque e abate do saldo a quantia mais a taxa.
      balance -= amount +5;
   }

   public String toString() {
      return "Account "
         + number
         + ", holder: "
         + holder
         + ", Balance: $ "
         + String.format("%.2f", balance);
   };
};