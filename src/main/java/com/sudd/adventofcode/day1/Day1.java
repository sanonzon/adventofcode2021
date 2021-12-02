package com.sudd.adventofcode.day1;

import java.util.List;

/**
 * 
 * https://adventofcode.com/2021/day/1
 * 
 */
public class Day1 {
    public int calc(List<Integer> numbers) {
        int higherCount = 0;

        Integer recent = null;
        for (int current : numbers) {
            if (recent != null && current > recent) {
                higherCount++;
            }
            recent = current;
        }

        return higherCount;
    }
}