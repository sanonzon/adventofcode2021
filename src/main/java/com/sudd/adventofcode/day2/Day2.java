package com.sudd.adventofcode.day2;

import java.util.List;

public abstract class Day2 {

    public static int part_one(List<String> rows) {
        int depth = 0;
        int horizaontal = 0;
        for (String row : rows) {
            if (row.toLowerCase().startsWith("forward")) {
                horizaontal += Integer.parseInt(row.replaceAll("forward", "").trim());
            } else if (row.toLowerCase().startsWith("up")) {
                depth -= Integer.parseInt(row.replaceAll("up", "").trim());
            } else if (row.toLowerCase().startsWith("down")) {
                depth += Integer.parseInt(row.replaceAll("down", "").trim());
            }

        }

        return depth * horizaontal;
    }

    public static int part_two(List<String> commands) {
        int depth = 0;
        int horizaontal = 0;
        int aim = 0;
        for (String row : commands) {
            if (row.toLowerCase().startsWith("forward")) {
                int number = Integer.parseInt(row.replaceAll("forward", "").trim());
                horizaontal += number;
                depth += number * aim;
            } else if (row.toLowerCase().startsWith("up")) {
                int number = Integer.parseInt(row.replaceAll("up", "").trim());
                aim -= number;
                // depth -= number;
            } else if (row.toLowerCase().startsWith("down")) {
                int number = Integer.parseInt(row.replaceAll("down", "").trim());
                aim += number;
            }

        }

        return depth * horizaontal;
    }
}
