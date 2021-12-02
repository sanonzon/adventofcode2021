package com.sudd.adventofcode;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.sudd.adventofcode.helper.InputHelper;

import org.junit.Test;

public class Day1Test {

    @Test
    public void doot_2_higher() {
        Day1 depth = new Day1();

        List<Integer> ints = Arrays.asList(1, 3, 5, 2, 2, 2, 2, 2, 2);
        assertEquals(2, depth.calc(ints));
    }

    @Test
    public void doot_3_higher() {
        Day1 depth = new Day1();

        List<Integer> ints = Arrays.asList(1, 2, 3, 5, 2, 2, 2, 2, 2, 2);
        assertEquals(3, depth.calc(ints));
    }

    @Test
    public void doot_7_higher_adventodcode_example() {
        Day1 depth = new Day1();

        List<Integer> ints = Arrays.asList(199, 200, 208, 210, 200, 207, 240, 269, 260, 263);
        assertEquals(7, depth.calc(ints));
    }

    @Test
    public void doot_do_calc() throws IOException {
        Day1 depth = new Day1();
        System.out.println(depth.calc(InputHelper.readIntsFromFile("day1.txt")));
    }

}
