package Funcionarios2;

public class ThirdEmployee extends Employee {
   
   private double additionalCharge;

   public ThirdEmployee(){}

   public ThirdEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
      super(name, hours, valuePerHour);
      this.additionalCharge = additionalCharge;
   }

   public double getAdditionalCharge() {
      return additionalCharge;
   }

   public void setAdditionalCharge(double additionalCharge) {
      this.additionalCharge = additionalCharge;
   }

   @Override
   public double payment() {
      return super.payment() + additionalCharge * 1.1;
   }
}
