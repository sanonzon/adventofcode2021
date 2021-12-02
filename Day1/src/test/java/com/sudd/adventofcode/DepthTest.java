package com.sudd.adventofcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DepthTest {

    @Test
    public void doot_2_higher() {
        Depth depth = new Depth();

        int[] ints = new int[] { 1, 3, 5, 2, 2, 2, 2, 2, 2 };
        assertEquals(2, depth.calc(ints));
    }

    @Test
    public void doot_3_higher() {
        Depth depth = new Depth();

        int[] ints = new int[] { 1, 2, 3, 5, 2, 2, 2, 2, 2, 2 };
        assertEquals(3, depth.calc(ints));
    }

    @Test
    public void doot_7_higher_adventodcode_example() {
        Depth depth = new Depth();

        int[] ints = new int[] { 199, 200, 208, 210, 200, 207, 240, 269, 260, 263 };
        assertEquals(7, depth.calc(ints));
    }

}
