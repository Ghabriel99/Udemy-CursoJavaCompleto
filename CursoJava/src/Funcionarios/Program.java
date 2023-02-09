package Funcionarios;

import java.util.ArrayList;
import java.util.Scanner;
import Funcionarios2.Employee;
import Funcionarios2.ThirdEmployee;

public class Program {
   
   public static void main(String[] args) {

      Scanner sc = new  Scanner(System.in);

      ArrayList<Employee> list = new ArrayList<Employee>();

      System.out.println("Enter the number of employess: ");
      int n = sc.nextInt();

      for(int i=1; i<=n; i++) {
         System.out.println("Employee # 1" + i + " data: ");
         System.out.print("Outsourced (y/n) ?: ");
         char ch = sc.next().charAt(0);

         System.out.print("Name: ");
         sc.nextLine();
         String name = sc.nextLine();

         System.out.print("Hours: ");
         int hours = sc.nextInt();

         System.out.print("Value per hour: ");
         double valuePerHour = sc.nextDouble();

         if(ch == 'y') {
            System.out.print("Additional charge: ");
            double additionalCharge = sc.nextDouble();

            list.add(new ThirdEmployee(name, hours, valuePerHour, additionalCharge));

         } else {
            list.add(new Employee(name, hours, valuePerHour));
         }
      }

      System.out.println();
      System.out.println("PAYMENTS :");

      for(Employee emp : list) {
         System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
      }
      sc.close();
   }
}
