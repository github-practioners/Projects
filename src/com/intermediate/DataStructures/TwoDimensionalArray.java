package com.intermediate.DataStructures;

import java.lang.reflect.Array;
import java.time.temporal.ValueRange;

public class TwoDimensionalArray {
    int arr[][] = null;

    //Constructor
    public TwoDimensionalArray(int numberOfRows, int numberOfColumns){
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void traverseArray(){
        try {
            for (int row = 0; row < arr.length; row++) {
                for(int col = 0; col < arr[0].length; col++) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("Array does not exists");
        }
    }

    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("Insertion: Successfully Inserted the value " + value + "in the 2D array position @" + row + "," + col);
            }
            else {
                System.out.println("Value already occupied in the 2D array position @" + row + "," + col);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array does not exists" + e);
        }
    }

    public void accessValueInTheArray(int row, int col) {
        try {
                System.out.println(arr[row][col]);
                System.out.println("Accessing Array Index: Successfully accessed the value from  the 2D array position @" + row + "," + col);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array does not exists" + e);
        }
    }

    public void searchValueInTheArray(int value) {
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[0].length; col++) {
                if(arr[row][col] == value){
                    System.out.println("Search Results: Value found in the location : " + row + "," + col);
                    return;
                }
            }
        }
        System.out.print(value + " not found in the Array");
    }


    public void deleteValueFromArray(int row, int col) {
        try {
            arr[row][col]=Integer.MIN_VALUE;
            System.out.println("Deleting value from Array Index: Successfully deleted the value from  the 2D array position @" + row + "," + col);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array does not exists" + e);
        }
    }

    public void deleteThisArray() {
        arr = null;
        System.out.println("Array Deleted");
    }

}
