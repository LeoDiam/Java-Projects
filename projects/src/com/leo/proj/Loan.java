package com.leo.proj;

import java.util.Scanner;

public class Loan {
    String name;
    int afm;
    double amount;
    double rate;
    double paidAmount;
    double remainder;
    static Scanner sc = new Scanner(System.in);//a scanner to use for asking user's values
    public Loan() { //empty constructor that initializes name and numerical values
        this.name = " ";
        this.afm = 0;
        this.paidAmount = 0.0;
        this.amount = 0.0;
        this.rate = 0.0;
        this.remainder = 0.0;
    }

    public Loan(String name, int afm, double amount, double rate, double paidAmount) {
        this.name = name;
        int count = 0;
        int afmCopy = afm;
        while(afmCopy!=0){ //to count the digit
            afmCopy = afmCopy/10;
            count++;
        }
        if(count == 9){ //checks if the afm is valid
        this.afm = afm;
        }
        if(amount > 0) {//checks if the amount is valid
            this.amount = amount;
        }else{
            this.amount = 0.0 ;
        }
        if(rate >= 0.01 && rate <= 0.20){//checks if the rate is valid
            this.rate = rate;
        }else {
            this.rate = 0.0;
        }
        if(paidAmount == (amount + amount * rate)) { // checks if paid amount equals amount + amount * rate
            this.paidAmount = paidAmount;
        }else {
            this.paidAmount = 0.0;
        }
        this.remainder = calcRemainder(this.amount,this.rate,this.paidAmount);
    }
    public static double calcRemainder(double amount,double rate,double paidAmount){
        double rem = amount + (amount * rate) - paidAmount;
        if(rate == 0.0)
        return amount - paidAmount;
        else
          return rem;   //returns the remainder
    }
    public  static Loan read(){
        System.out.println("Input your name");
        String name = sc.next();//next line for no reason bugs on the array bank part of the assignment
        System.out.println("Input your afm");
        int afm = sc.nextInt();
        System.out.println("Input your amount");
        double amount = sc.nextDouble();
        System.out.println("Input your rate");
        double rate = sc.nextDouble();
        System.out.println("Input the amount you have already paid");
        double paidAmount = sc.nextDouble();
        return new Loan(name,afm,amount,rate,paidAmount);//returns a new com.leo.proj.Loan with users input
    }
    public static void print(Loan l){//gets and prints loans attributes from the getters
        System.out.println("\nAfm: "+l.getAfm()
                +"\nName: "+l.getName()
                +"\nAmount: "+l.getAmount()
                +"\nPaid Amount"+l.getPaidAmount()
                +"\nRate: "+l.getRate()
                +"\nRemainder: "+l.getRemainder());
    }

    public String getName() {
        return name;
    }

    public int getAfm() {
        return afm;
    }

    public double getAmount() {
        return amount;
    }

    public double getRate() {
        return rate;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public double getRemainder() {
        return remainder;
    }

}
