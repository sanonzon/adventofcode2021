package com.sudd.adventofcode;

/**
 * 
 * https://adventofcode.com/2021/day/1
 * 
 */
public class Depth {

    public void main(String[] args) {

    }

    public int calc(int[] numbers) {
        int higherCount = 0;

        Integer recent = null;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (recent != null && current > recent) {
                higherCount++;
            }
            recent = current;
        }

        return higherCount;
    }
}