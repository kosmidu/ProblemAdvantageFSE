package com.company;

import javafx.util.Pair;
import java.util.Comparator;

/**
 * This Class implements the compare() method according to user defined criteria.
 * It inherits the Comparator class.
 * <p>
 * @author Kosmidou Maria
 * @version 1.0
 * @since 2018-01-22
 */
public class MyComparator implements Comparator<Pair<Long,Integer>>
{
    /**
     * This method is our compare() method.
     * It implements the Comparator class, so as to sort the list according to our defined criteria.
     * It sorts, in descending order, the whole list of pairs, using the Long numbers as a sort key.
     * This method compares o2 and o1 and if o2 is larger than o1
     * then the o2 should come before o1 in output, else o1 should come before.
     * @param o1 Object (o1) of Pair class
     * @param o2 Object (o2) of Pair class
     * @return int <ul>
     *              <li>If o2 is equal to o1, it returns 0</li>
     *              <li>If o2 is larger than o1, it returns 1</li>
     *              <li>If o2 is smaller than o1, it returns -1</li>
     *             </ul>
     */

    public int compare(final Pair<Long, Integer> o1, final Pair<Long, Integer> o2)
    {
        return Integer.compare(o2.getKey().intValue(), o1.getKey().intValue());
    }
}