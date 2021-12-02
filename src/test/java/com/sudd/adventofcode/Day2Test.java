package com.sudd.adventofcode;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sudd.adventofcode.day2.Day2;
import com.sudd.adventofcode.helper.InputHelper;

import org.junit.Test;

public class Day2Test {

    @Test
    public void part_one_example() {
        List<String> commands = new ArrayList<>();
        commands.add("forward 5");
        commands.add("down 5");
        commands.add("forward 8");
        commands.add("up 3");
        commands.add("down 8");
        commands.add("forward 2");

        assertEquals(150, Day2.part_one(commands));
    }

    @Test
    public void part_one_input_file() throws IOException {
        List<String> rows = Arrays.asList(InputHelper.readInputfile("day2.txt").split("\\n"));
        System.out.println(Day2.part_one(rows));
        // assertEquals(150, Day2.part_one(rows));
    }

    @Test
    public void part_two_example() {
        List<String> commands = new ArrayList<>();
        commands.add("forward 5");
        commands.add("down 5");
        commands.add("forward 8");
        commands.add("up 3");
        commands.add("down 8");
        commands.add("forward 2");

        assertEquals(900, Day2.part_two(commands));
    }

    @Test
    public void part_two_input_file() throws IOException {
        List<String> rows = Arrays.asList(InputHelper.readInputfile("day2.txt").split("\\n"));
        System.out.println(Day2.part_two(rows));
        // assertEquals(150, Day2.part_one(rows));
    }
}
