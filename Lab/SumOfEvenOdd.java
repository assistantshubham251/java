package com.company;
import java.util.*;
public class SumOfEvenOdd {
    public static void main(String args[]){

        int n=200, i=1, evenSum = 0, oddSum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter any number:");
        int number = sc.nextInt();
        for(i=1; i<=200; i++){
            if(i%2==0){
                evenSum = evenSum + i;

            }
            else{
                oddSum = oddSum + i;

            }
        }
        System.out.println("\n The Sum of Even Number  " + number + "  =  " + evenSum);
        System.out.println("\n The Sum of Odd Number  " + number + "   =   " + oddSum);
    }


}
