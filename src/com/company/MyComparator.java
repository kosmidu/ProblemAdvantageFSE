package com.company;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer>
{
    public int compare(Integer a, Integer b)
    {
        // Concatenate two integers
        String ab = Integer.toString(a) + Integer.toString(b);
        String ba = Integer.toString(b) + Integer.toString(a);

        return Integer.compare(Integer.parseInt(ba),Integer.parseInt(ab));
    }
}
