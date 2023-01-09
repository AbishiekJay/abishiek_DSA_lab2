package com.greatLearning.dsa.currencyDenomination;

import java.util.Scanner;

public class TravelCurrencyCountApp {
    public static void main(String[] args) {
        System.out.println("enter the size of currency denominations");
        Scanner scan = new Scanner(System.in);
        int denominationSize = scan.nextInt();
        int[] denominations = new int[denominationSize];
        System.out.println("enter the currency denominations value");
        for (int i = 0; i < denominationSize; i++)
            denominations[i] = scan.nextInt();
        SortCurrencyDenomination sort = new SortCurrencyDenomination();
        sort.sortDenominations(denominations,0,denominationSize-1);
        System.out.println("enter the amount you want to pay");
        int amountToBePaid = scan.nextInt();
        CountNotes count = new CountNotes();
        count.countNotes(denominations,amountToBePaid);

    }
}
