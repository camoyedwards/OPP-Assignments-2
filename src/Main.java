import Payrollmanagement.Manager;
import Payrollmanagement.SalesRep;
import Payrollmanagement.StaffMember;

import java.util.ArrayList;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
     SalesRep sales1  =  new SalesRep();

        ArrayList<SalesRep> salesRepList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println(" Enter Sales rep Name");
            System.out.print("\tFirst Name: ");
            sales1.setFirstname(scanner.next());

            salesRepList.add(sales1);
        }

        for (SalesRep sale1:salesRepList) {
            System.out.println(sale1.getFirstname());
        }

     Manager management1 = new Manager("Oats",
             "Porridge","56",
             80,3600);

     management1.display();

     // just an example management1.setFirstname("Daffy");


     // another example
     //sales1.setFirstname(scanner.next());
     //System.out.printf(sales1.getFirstname());


    }
}