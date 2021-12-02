package com.sudd.adventofcode.day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day2 {

    /**
     * https://adventofcode.com/2021/day/1#part2
     */

    public int calculate(List<Integer> numbers) {
        int increments = 0;
        Integer lastSum = null;
        List<Integer> collection_1 = new ArrayList<>();
        List<Integer> collection_2 = new ArrayList<>();
        List<Integer> collection_3 = new ArrayList<>();

        LinkedList<List<Integer>> collections = new LinkedList<>();
        collections.add(collection_1);
        collections.add(collection_2);
        collections.add(collection_3);

        for (int i = 0; i < numbers.size(); i++) {
            Integer number = numbers.get(i);

            if (i == 0) { // First list
                collections.get(0).add(number);
            } else if (i == 1) { // First and Second list
                collections.get(0).add(number);
                collections.get(1).add(number);
            } else { // All lists
                collections.get(0).add(number);
                collections.get(1).add(number);
                collections.get(2).add(number);
            }

            for (List<Integer> list : collections) {
                if (list.size() == 3) {
                    int sum = list.stream().mapToInt(p -> p.intValue()).sum();
                    if (lastSum != null && sum > lastSum) {
                        increments++;
                    }
                    lastSum = sum;
                    list.clear();
                }
            }
        }

        return increments;
    }
}
