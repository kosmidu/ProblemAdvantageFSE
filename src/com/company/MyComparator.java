package com.company;

import java.util.Comparator;

/**
 * This Class implements the compare() method according to user defined criteria.
 * It inherits the Comparator class.
 * <p>
 * @author Kosmidou Maria
 * @version 1.0
 * @since 2018-01-22
 */
public class MyComparator implements Comparator<Integer>
{
    /**
     * This method is our compare() method.
     * It implements the Comparator class, so as to sort the list according to our defined criteria.
     * It concatenates two integers of the list, so as to make two combinations of these integers.
     * The two combinations are ab, ba. This method compares ab and ba and if ab is larger than ba
     * then the a should come before b in output, else b should come before.
     * @param a Element (a) of the ArrayList
     * @param b Element (b) of the ArrayList
     * @return int <ul>
     *              <li>If ba is equal to ab, it returns 0</li>
     *              <li>If ba is larger than ab, it returns 1</li>
     *              <li>If ba is smaller than ab, it returns -1</li>
     *             </ul>
     */
    public int compare(Integer a, Integer b)
    {
        // Concatenate two integers
        String ab = Integer.toString(a) + Integer.toString(b);
        String ba = Integer.toString(b) + Integer.toString(a);

        return Integer.compare(Integer.parseInt(ba),Integer.parseInt(ab));
    }
}