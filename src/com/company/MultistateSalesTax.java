package com.company;
import java.util.Scanner;

    public class MultistateSalesTax {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int amount;
        double tAmount = 0.0, tax = 0.0;

        System.out.print("What is order amount? ");
        amount = sc.nextInt();
        System.out.print("What state do you live in? ");
        String state = sc.next();

        if(state.equals("Tennessee")){
            System.out.print("What county do you live in? ");
            String county = sc.next();
            if(county.equals("Davidson")){
                tax = (amount*9.025)/100;
                tAmount = tax + amount;
            }
            else if(county.equals("Knox")){
                tax = (amount*2.025)/100;
                tAmount = tax + amount;
            }
            else{
               System.out.println("Enter correct county");
            }
        }
        else if(state.equals("South Carolina")){
            tax = (amount*9)/100;
            tAmount = tax + amount;
        }
        else{
            tax = 0.0;
            tAmount = amount;
        }
        System.out.println("The tax is  $"+String.format("%.2f",tax));
        System.out.println("The total is  $"+String.format("%.2f",tAmount));
    }
}
