package com.company;

public class ForwardList {
    private int size = 0;
    private ListObject obj;

    public void add(int value, int index) {
        if (size == 0) {
            obj = new ListObject(null, null, value);
        } else {
            if (index == 0) {
                ListObject nextObj = obj;
                obj = new ListObject(null, nextObj, value);
                nextObj.setPrev(obj);
            } else {
                ListObject object = getObject(index - 1);
                if (size > index) {
                    ListObject nextObject = object.getNext();
                    object.setNext(new ListObject(object, nextObject, value));
                    nextObject.setPrev(object);
                } else {
                    object.setNext(new ListObject(object, null, value));
                }
            }
        }
        size++;
    }

    public void remove(int index) {
        try {
            ListObject object = getObject(index);
            object.getPrev().setNext(object.getNext());
            object = null;
        } catch (NullPointerException ex) {
            throw new IndexOutOfBoundsException();
        }
    }

    public int get(int index) {
        try {
            return getObject(index).getValue();
        } catch (NullPointerException ex) {
            throw new IndexOutOfBoundsException();
        }

    }

    private ListObject getObject(int index) {
        if (size > 0) {
            ListObject object = obj;
            for (int i = 0; i < index; i++)
                object = object.getNext();
            return object;
        }
        throw new IndexOutOfBoundsException();
    }

    public int getHead() {
        if (size > 0) return obj.getValue();
        else throw new IndexOutOfBoundsException();
    }

    public void addToHead(int value) {
        ListObject nextObject = obj;
        obj = new ListObject(null, nextObject, value);
        nextObject.setPrev(obj);
    }
}
