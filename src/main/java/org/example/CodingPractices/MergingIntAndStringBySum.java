package org.example.CodingPractices;

import java.util.ArrayList;

public class MergingIntAndStringBySum {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        stringList.add("e");


        ArrayList<String> mergedList = mergeLists(intList, stringList);

        for (String mergedItem : mergedList) {
            System.out.println(mergedItem);
        }
    }

    public static ArrayList<String> mergeLists(ArrayList<Integer> intList, ArrayList<String> stringList) {
        ArrayList<String> mergedList = new ArrayList<>();
        int size = Math.min(intList.size(), stringList.size());
        for (int i = 0; i < size; i++) {
            mergedList.add(intList.get(i) + stringList.get(i));
        }
        return mergedList;
    }
}
