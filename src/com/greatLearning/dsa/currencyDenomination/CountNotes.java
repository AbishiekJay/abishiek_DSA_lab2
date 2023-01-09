package com.greatLearning.dsa.currencyDenomination;

public class CountNotes {
    public void countNotes(int[] denominations, int amountToBePaid) {
        int[] counter = new int[denominations.length];
        try{
            for (int i = 0; i< denominations.length; i++){
                if(amountToBePaid >= denominations[i]){
                    counter[i] = amountToBePaid/denominations[i];
                    amountToBePaid -= (counter[i] * denominations[i]);
                }
            }
            if (amountToBePaid > 0)
                System.out.println("exact amount cannot be given with the given denominations");
            else {
                System.out.println("Your payment approach in order to give min no of notes will be");
                for(int i = 0; i < denominations.length; i++){
                    if (counter[i] != 0 ){
                        System.out.println(denominations[i] + ":" + counter[i]);
                    }
                }
            }
        }catch (ArithmeticException e){
            System.out.println("Notes of denomination 0 is invalid");
            e.printStackTrace();
        }
    }
}
