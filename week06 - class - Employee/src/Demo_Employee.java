
public class Demo_Employee {

  public static void main(String[] args) {

      UMUC_Employee jane = new UMUC_Employee();
      UMUC_Employee tom = new UMUC_Employee();
      double pay = 0.0;

      jane.setPayRate(19.95);
      jane.setHoursWorked(38.0);
      pay = jane.calculatePay();
      System.out.println("Jane is owed " + pay);// OUTPUT

      tom.setPayRate(20.54);
      tom.setHoursWorked(42.0);
      pay = tom.calculatePay();
      System.out.println("Tom is owed " + pay);// OUTPUT
      } // end method

  }


