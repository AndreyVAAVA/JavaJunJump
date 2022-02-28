package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        // Yandex task, sry, I was too lazy to create new project
        /*BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        ArrayList<String> read = new ArrayList<>();
        while (reader.ready())
            read.add(reader.readLine());
        reader.close();
        String[] arr = new String[read.size()];
        Pattern pattern = Pattern.compile("[0-9]+");
        for (String elem : read) {
            String positionToPaste = "";
            Matcher matcher = pattern.matcher(elem);
            if (matcher.find())
                positionToPaste = matcher.group(0);
            if (!positionToPaste.isEmpty())
                arr[Integer.parseInt(positionToPaste) - 1] = elem.replace(positionToPaste, "");
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                writer.write(arr[i] + "\n");
            else
                writer.write("");
        }
        writer.close();*/
        /*ForwardList list = new ForwardList();
        list.add(10, 0);
        list.add(20, 1);
        list.add(15, 2);
        list.add(14, 1);
        for (int i = 0; i < 4; i++) {
            System.out.println(list.get(i));
        }
        list.remove(1);
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
        list.addToHead(96);
        for (int i = 0; i < 4; i++) {
            System.out.println(list.get(i));
        }*/
        DynamicArray array = new DynamicArray();
        array.add(10, 0);
        array.add(10, 0);
        array.add(10, 0);
        array.add(20, 1);
        /*for (int i = 0; i < 3; i++) {
            System.out.println(array.get(i));
        }*/
        array.remove(2);
        array.remove(0);
        /*for (int i = 0; i < 3; i++) {
            System.out.println(array.get(i));
        }*/
        array.addToEnd(555);
        array.addToEnd(666);
        /*for (int i = 0; i < 4; i++) {
            System.out.println(array.get(i));
        }*/
        array.removeFromEnd();
        for (int i = 0; i < 3; i++) {
            System.out.println(array.get(i));
        }
    }
}
