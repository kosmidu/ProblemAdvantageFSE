package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

/**
 * This Class implements some useful Unit tests, for easier control of the alternate approach
 * of the main ProblemAdvantageFSE program.
 * It uses JUnit4 testing library.
 * <p>
 * @author Kosmidou Maria
 * @version 2.0
 * @since 2018-01-23
 */
public class MainTest
{
    @org.junit.Test
    public void test01()
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(420, 42, 423));
        String expected_str = "42423420";
        assertTrue(ProblemAdvantageFSE.findMaxNumber(list).equals(expected_str));
    }

    @org.junit.Test
    public void test02()
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 50, 56));
        String expected_str = "56550";
        assertTrue(ProblemAdvantageFSE.findMaxNumber(list).equals(expected_str));
    }

    @org.junit.Test
    public void test03()
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(50, 2, 1, 9));
        String expected_str = "95021";
        assertTrue(ProblemAdvantageFSE.findMaxNumber(list).equals(expected_str));
    }

    @org.junit.Test
    public void test04()
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 34, 3, 98, 9, 76, 45,
                4, 12, 121));
        String expected_str = "99876454343121211";
        assertTrue(ProblemAdvantageFSE.findMaxNumber(list).equals(expected_str));
    }

    @org.junit.Test
    public void test05()
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(54, 546, 548, 60));
        String expected_str = "6054854654";
        assertTrue(ProblemAdvantageFSE.findMaxNumber(list).equals(expected_str));
    }

    @org.junit.Test
    public void test06()
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 776, 7, 7));
        String expected_str = "777776";
        assertTrue(ProblemAdvantageFSE.findMaxNumber(list).equals(expected_str));
    }

    @org.junit.Test
    public void test07()
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11, 0, 101, 10));
        String expected_str = "11101100";
        assertTrue(ProblemAdvantageFSE.findMaxNumber(list).equals(expected_str));
    }

    @org.junit.Test
    public void test08()
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));
        String expected_str = "9534330";
        assertTrue(ProblemAdvantageFSE.findMaxNumber(list).equals(expected_str));
    }
}