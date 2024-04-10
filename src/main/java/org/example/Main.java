package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Khanh Lam
 */
public class Main {
    public static void main(String args[])throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();
        System.out.println("Name of plan:");
        System.out.println("1. DomesticPlan");
        System.out.println("2. CommercialPlan");
        System.out.println("3. InstitutionalPlan");

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String planName=br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);
        //call getRate() method and calculateBill()method of DomesticPaln.

        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}