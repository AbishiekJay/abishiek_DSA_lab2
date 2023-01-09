package com.greatLearning.dsa.payMoney;

import java.util.Scanner;

public class PayMoneyApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of transaction array");
        int transactionSize = sc.nextInt();
        int[] transactionValues = new int[transactionSize];
        System.out.println("enter the values of array");
        for (int i =0;i<transactionValues.length;i++)
            transactionValues[i] = sc.nextInt();
        System.out.println("enter the total no of targets that needs to be achieved");
        int targetTransaction = sc.nextInt();

        for(int i = 1; i<= targetTransaction; i++){
            boolean flag = false;
            System.out.println("enter the value of target");
            long targetValue = sc.nextInt();
            long sum = 0;
            for(int j = 0; j < transactionSize; j++){
                sum += transactionValues[j];
                if (sum >= targetValue){
                    System.out.println("Target achieved after "+(i+1)+" transactions");
                    flag = true;
                    break;
                }
            }
            if(!flag)
                System.out.println("Given target is not achieved");
        }
    }
}
