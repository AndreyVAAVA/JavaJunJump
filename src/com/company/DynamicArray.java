package com.company;

public class DynamicArray {
    int currArrSize = 1;
    int amountOfObjects = 0;
    int currSize = 0;
    int[] arr = new int[currSize];

    public void add(int value, int index) {
        if (currSize == amountOfObjects) {
            resize(currArrSize * 2);
            currArrSize *= 2;
        }
        int[] newArr = new int[arr.length - 1];
        if (index >= 0) System.arraycopy(arr, 0, newArr, 0, index);
        newArr[index] = value;
        if (arr.length - 1 - index >= 0) System.arraycopy(arr, index, newArr, index + 1, arr.length - 1 - index);
        currSize++;
        arr = newArr;
    }

    public void remove(int index) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == index) {
                int[] newArr = new int[arr.length - 1];
                System.arraycopy(arr, 0, newArr, 0, i);
                if (arr.length - 1 - i >= 0) System.arraycopy(arr, i + 1, newArr, i, arr.length - 1 - i);
                arr = newArr;
                break;
            }
        }
    }

    public int get(int index) {
        return arr[index];
    }

    public void resize(int n) {
        int[] newArray = new int[n];
        System.arraycopy(arr, 0, newArray, 0, currArrSize);
        currArrSize = n;
        arr = newArray;
    }

    public void reserve(int n) {
        int[] newArray = new int[n];
        System.arraycopy(arr, 0, newArray, 0, currArrSize);
        currArrSize = n;
        arr = newArray;
    }

    public void addToEnd(int value) {
        if (currSize == amountOfObjects) {
            resize(currArrSize * 2);
            currArrSize *= 2;
        }
        arr[currSize++] = value;
    }

    public void removeFromEnd() {
        arr[arr.length - 1] = 0;
    }

}
