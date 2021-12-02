package com.sudd.adventofcode.helper;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.IOUtils;

public abstract class InputHelper {
    public static String readInputfile(String filename) throws IOException {
        try (InputStream is = InputHelper.class.getClassLoader().getResourceAsStream(filename)) {
            return IOUtils.toString(is, StandardCharsets.UTF_8);
        }
    }

    public static List<Integer> readIntsFromFile(String filename) throws IOException {
        List<String> doots = Arrays.asList(readInputfile(filename).split("\\s"));

        List<Integer> dooters = new ArrayList<>();
        for (String doot : doots) {
            if (doot.trim().isEmpty()) {
                continue;
            }
            dooters.add(Integer.parseInt(doot));
        }
        return dooters;
    }

}
