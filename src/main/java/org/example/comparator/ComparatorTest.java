package org.example.comparator;

import java.util.Arrays;

public class ComparatorTest {
    public static void main(String[] args) {
        String[] friends = {"Diogo", "Márcio", "Yago", "Gabriel", "Helon"};
        System.out.println(Arrays.toString(friends));
        Arrays.sort(friends, new LengthComparator());
        System.out.println(Arrays.toString(friends));
    }
}
