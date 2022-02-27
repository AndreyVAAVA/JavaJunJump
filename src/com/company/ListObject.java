package com.company;

public class ListObject {
    private ListObject prev;
    private ListObject next;
    private int value;

    public ListObject(ListObject prev, ListObject next, int value) {
        this.prev = prev;
        this.next = next;
        this.value = value;
    }

    public ListObject getPrev() {
        return prev;
    }

    public void setPrev(ListObject prev) {
        this.prev = prev;
    }

    public ListObject getNext() {
        return next;
    }

    public void setNext(ListObject next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
