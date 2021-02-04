package com.intermediate.DataStructures;

//Example of Single Dimensional Array
public class SingleDimensionalArray {
    int arr[] = null;
    public SingleDimensionalArray(int sizeOfArray){
        arr=new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // Print the array
    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }

    // Insert the value into the array
    public void insertArrayValueByLocation(int location, int valueToBeInserted) {
        try {
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Successfully Inserted");
            } else {
                System.out.println("Already value is stored");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }
}
