package com.sudd.adventofcode;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.sudd.adventofcode.day1.Day1;
import com.sudd.adventofcode.helper.InputHelper;

import org.junit.Test;

public class Day1Test {

    @Test
    public void doot_2_higher() {
        List<Integer> ints = Arrays.asList(1, 3, 5, 2, 2, 2, 2, 2, 2);
        assertEquals(2, Day1.part_one(ints));
    }

    @Test
    public void doot_3_higher() {
        List<Integer> ints = Arrays.asList(1, 2, 3, 5, 2, 2, 2, 2, 2, 2);
        assertEquals(3, Day1.part_one(ints));
    }

    @Test
    public void doot_7_higher_adventodcode_example() {
        List<Integer> ints = Arrays.asList(199, 200, 208, 210, 200, 207, 240, 269, 260, 263);
        assertEquals(7, Day1.part_one(ints));
    }

    @Test
    public void doot_do_calc() throws IOException {
        System.out.println(Day1.part_one(InputHelper.readIntsFromFile("day1.txt")));
    }

    @Test
    public void doot_should_be_6() {
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
        assertEquals(6, Day1.part_two(ints));
    }

    @Test
    public void doot_input_challenge() throws IOException {
        List<Integer> ints = InputHelper.readIntsFromFile("day1.txt");
        System.out.println(Day1.part_two(ints));

        // Result reported to AoC
        assertEquals(1257, Day1.part_two(ints));
    }
}
