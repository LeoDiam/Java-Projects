package com.leo.proj;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the binary number");
        int n1 = sc.nextInt();
        while (n1 < 0){                 //if the number is negative the loop runs again
            System.out.println("Please enter the binary number");
             n1 = sc.nextInt();
        }
        checkIfItIsBinaryNum(sc, n1); //checking if the number is binary
        System.out.println("Please enter the binary number");
        int n2 = sc.nextInt();
        while (n2 < 0){
            System.out.println("Please enter the binary number");
            n2 = sc.nextInt();
        }
        checkIfItIsBinaryNum(sc, n2); //checking if the number is binary
        int count1 = 0 ;      //to count the num of digits
        int count2 = 0;
        int n1Copy = n1; //we create copies in order to count the digits
        int n2Copy = n2;
        while(n1Copy!=0){
            n1Copy = n1Copy/10;
            count1++;
        }
        while(n2Copy!=0){       //to count the num of digits
            n2Copy = n2Copy/10;
            count2++;
        }
        long[] outputHolder;
        if(count1 > count2){
              outputHolder = new long[count1+1];
        }else{                                //creating an array to hold the output of the binary addition using the length of its digits
              outputHolder = new long[count2+1];
        }
        long helpMaintainInfo = 0;
        int arrayCounter = 0;
        while (n1 != 0 || n2 != 0)  //inside the loop are made the suitable calculations for binary nums
        {
            outputHolder[arrayCounter++] = ((n1 % 10 + n2 % 10 + helpMaintainInfo) % 2);
            helpMaintainInfo = ((n1 % 10 + n2 % 10 + helpMaintainInfo) / 2);
            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        if (helpMaintainInfo != 0) {
            outputHolder[arrayCounter++] = helpMaintainInfo;
        }
        --arrayCounter;
        StringBuilder outPut = new StringBuilder();
        System.out.print("Output: ");    //printing the binary result using a loop to check the content of the array
        while (arrayCounter >= 0) {

            int use = (int) outputHolder[arrayCounter--];
            System.out.print(use);
            outPut.append(use); // keeping the number to a string
        }

        System.out.println();
        System.out.println(Integer.parseInt(outPut.toString(), 2)); //parsing the int using one method that converts
    }

    private static void checkIfItIsBinaryNum(Scanner sc, long n1) {
        int counter1 = 0;
        int counter2 = 0;
        while(n1 >0)                                     //this loop will run until there are no numbers
        {
            if((n1 % 10 == 0) || (n1 % 10 == 1)){     // by finding the mode you check if every digit is one or zero
                counter1++;                            //in case it is counter1 increases
            }
            counter2++;                          //in any case in the loop counter2 increases
            n1 = n1 /10;
        }
        while (counter1 != counter2){           // obviously if they are not the same it means that the condition was in some point false so the number is not binary
            System.out.println("Please enter the binary number"); // you ask for the number again
             n1 = sc.nextInt();
            while(n1 >0)                                          // same logic loop
            {
                if((n1 % 10 == 0) || (n1 % 10 == 1)){
                    counter1++;
                }
                counter2++;
                n1 = n1 /10;
            }
        }
    }
}
