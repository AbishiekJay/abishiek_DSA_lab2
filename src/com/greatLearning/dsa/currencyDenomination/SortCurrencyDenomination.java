package com.greatLearning.dsa.currencyDenomination;

public class SortCurrencyDenomination {
    public void sortDenominations(int[] denominations , int min , int max){
        if(min < max){
            int mid = (min + max)/2;
            sortDenominations(denominations,min,mid);
            sortDenominations(denominations,mid+1,max);
            merge(denominations,min,mid,max);
        }

    }

    private void merge(int[] denominations, int min, int mid, int max) {
        int i,j,k;
        int[] tempArr = new int[max + 1];
        i = min;
        j = mid + 1;
        k = min;
        while (i <= mid && j <= max){
            if (denominations[i] > denominations[j])
                tempArr[k++] = denominations[i++];
            else
                tempArr[k++] = denominations[j++];
        }
        for (;i <= mid; i++)
            tempArr[k++] = denominations[i];
        for (;j<=max;j++)
            tempArr[k++] = denominations[j];
        for (i = min; i <= max; i++)
            denominations[i] = tempArr[i];
    }
}
