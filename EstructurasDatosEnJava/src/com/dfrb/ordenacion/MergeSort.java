package com.dfrb.ordenacion;

public class MergeSort {
    static int[] a = {3,5,6,1,7,9,12,43,10,8};
	
    public static void main(String[] args) {
	int[] tempArray = new int[a.length];
	mergeSort(tempArray, 0, a.length - 1);
		
	for (int element : a) {
            System.out.println("Valor: "+ element);
	}
    }
	
    static void mergeSort(int[] arrayToFix, int lowerIndex, int upperIndex) {
	if (lowerIndex == upperIndex) {
            return;
	}
	int middle = (lowerIndex + upperIndex) / 2;
	mergeSort(arrayToFix, lowerIndex, middle);
	mergeSort(arrayToFix, middle + 1, upperIndex);
	merge(arrayToFix, lowerIndex, middle + 1, upperIndex);
    }

    private static void merge(int[] arrayToFix, int lowerIndexCursor, int higherIndex, int upperIndex) {
        int tempIndex = 0;
        int lowerIndex = lowerIndexCursor;
        int midIndex = higherIndex - 1;
        int totalItems = upperIndex - lowerIndex + 1;
        
        while (lowerIndex <= midIndex && higherIndex <= upperIndex) {
            if (a[lowerIndex] < a[higherIndex]) {
        	arrayToFix[tempIndex++] = a[lowerIndex++];
            } else {
        	arrayToFix[tempIndex++] = a[higherIndex++];
            }
        }
        
        while (lowerIndex <= midIndex) {
            arrayToFix[tempIndex++] = a[lowerIndex++];
        }
        
        while (higherIndex <= upperIndex) {
            arrayToFix[tempIndex++] = a[higherIndex++];
        }
        
        for (int i = 0; i < totalItems; i++) {
            a[lowerIndexCursor + i] = arrayToFix[i];
        }
    }
}
