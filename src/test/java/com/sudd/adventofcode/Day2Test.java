package com.sudd.adventofcode;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.sudd.adventofcode.day2.Day2;
import com.sudd.adventofcode.helper.InputHelper;

import org.junit.Test;

public class Day2Test {

    @Test
    public void doot_should_be_6() {
        Day2 depth = new Day2();

        List<Integer> ints = Arrays.asList(
                1, // A
                2, // A B
                3, // A B C
                4, // B C D
                5, // C D E
                6, // D E F
                7, // E F G
                8, //
                9//

        );
        assertEquals(6, depth.calculate(ints));
    }

    @Test
    public void doot_input_challenge() throws IOException {
        Day2 depth = new Day2();

        List<Integer> ints = InputHelper.readIntsFromFile("day1.txt");

        System.out.println(depth.calculate(ints));
    }

}
