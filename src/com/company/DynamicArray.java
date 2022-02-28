package com.company;

public class DynamicArray {
    int currArrSize = 1;
    int amountOfObjects = 0;
    int currSize = 0;
    int[] arr = new int[currArrSize];

    public void add(int value, int index) {
        int[] newArr = new int[arr.length];
        if (currSize == amountOfObjects) {
            newArr = new int[currArrSize * 2];
            currArrSize *= 2;
        }
        if (index == 0) {
            newArr[0] = value;
            System.arraycopy(arr, 0, newArr, 1, arr.length);
        } else {
            if (index >= 0) System.arraycopy(arr, 0, newArr, 0, index);
            newArr[index] = value;
            if (arr.length - index >= 0) System.arraycopy(arr, index, newArr, index + 1, arr.length - index);
        }
        currSize++;
        amountOfObjects++;
        arr = newArr;
    }

    public void remove(int index) {
        int[] newArr = new int[arr.length];
        if (index >= 0) System.arraycopy(arr, 0, newArr, 0, index);
        if (arr.length - (index + 1) >= 0)
            System.arraycopy(arr, index + 1, newArr, index + 1 - 1, arr.length - (index + 1));
        arr = newArr;
        amountOfObjects--;
    }

    public int get(int index) {
        if (index + 1 > amountOfObjects) throw new IndexOutOfBoundsException();
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
        currSize++;
        arr[amountOfObjects++] = value;
    }

    public void removeFromEnd() {
        arr[--amountOfObjects] = 0;
        currSize--;
    }

}
