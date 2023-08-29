package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStudents {
    @Test
    public void testConstructor() {
        // given
        String[] expectedNames = "Jarek,Andrew,Mary".split(",");

        // when
        List<String> nameList = new ArrayList<>();
        for(Student student : Students.getInstance()) {
            nameList.add(student.getName());
        }

        // then
        for(String expectedName : expectedNames) {
            Assert.assertTrue(nameList.contains(expectedName));
        }
    }
}
