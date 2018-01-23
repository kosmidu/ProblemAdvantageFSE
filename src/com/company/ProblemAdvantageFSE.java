package com.company;

import javafx.util.Pair;
import java.util.*;

/**
 * <h1>Problem - Advantage FSE Academy</h1>
 * <u>This is an alternate approach of the ProblemAdvantageFSE program.</u>
 * The ProblemAdvantageFSE program implements an application that
 * given an ArrayList of non negative integers, finds their largest
 * possible combined number and prints the output as a string on the screen.
 * <p>
 * @author Kosmidou Maria
 * @version 2.0
 * @since 2018-01-23
 */
public class ProblemAdvantageFSE
{
    /**
     * This method is used to get the input from console and insert it into a list.
     * Correct input is considered as non negative integers, only.
     * It has no parameters. It has console entry.
     * @return ArrayList This returns the 'inputList'. A list of the given non negative integers.
     * @exception NumberFormatException On input error.
     */
    private static ArrayList<Integer> insert()
    {
        ArrayList<Integer> inputList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s");

        for (String token : tokens)
        {
            try {
                inputList.add(Integer.parseInt(token));
            }catch(NumberFormatException ex) {
                System.err.println("Please, insert only integers.");
                System.exit(-1);
            }
        }
        return inputList;
    }

     /*//This is an auxiliary method, which is used to print the content of a list.
    private static void display(ArrayList<Integer> list)
    {
        for (Integer value : list)
            System.out.print(value + " ");
    }*/

    /**
     * This method is used to get a List with pairs of (key: Long, value: Integer)
     * and only the value-list convert it to a string.
     * @param intList List A list with pairs of key and values, from the package javafx.util.Pair.
     * @return String This returns a string with the same content of the above value-list.
     */
    private static String convertIntListToString(List<Pair<Long,Integer>> intList)
    {
        StringBuilder sb = new StringBuilder();

        for (Pair element : intList)
            sb.append(Integer.valueOf(element.getValue().toString()));

        return sb.toString();
    }

    /**
     * This method is used to implement the basic function of this project.
     * It gets an ArrayList with non negative integers and finds their largest possible combined number.
     * The main idea is
     * <ul>
     *     <li>find the maximum digits of the largest integer of the list (maxDigits)</li>
     *     <li>pad the integers to the same size by repeating the digits (size = maxDigits + 1)</li>
     *     <li>make a list of pairs(key: padded integers, value: original integers)</li>
     *     <li>sort using these padded integers as a sort key.</li>
     *     <li>the sorted value-list is the largest number </li>
     * </ul>
     * It makes use of the sort() method, implemented by the MyComparator class.
     * Then the convertIntListToString() method is called, so as to convert the sorted list to a string
     * @param integerList ArrayList A list with non negative integers.
     * @return String This returns a string,  which represents the maximum possible combined number, as a string.
     *         This is the result of the convertIntListToString() method.
     */
    public static String findMaxNumber(ArrayList<Integer> integerList)
    {
        int maxDigits = String.valueOf(Collections.max(integerList)).length();

        List<Pair<Long, Integer>> l_pair = new ArrayList<>();

        for (Integer element : integerList)
        {
            String init_temp = String.valueOf(element);
            StringBuilder temp = new StringBuilder(init_temp);
            int size = String.valueOf(element).length();
            int n = maxDigits - size;

            for(int i = 0, j = 0; i <= n; ++i)
            {
                temp.append(init_temp.charAt(j));
                if (j >= (size - 1))
                    j = 0;
                else
                    ++j;
            }
            Pair<Long, Integer> p = new Pair<>(Long.valueOf(temp.toString()), element);
            l_pair.add(p);
        }

        l_pair.sort(new MyComparator());

        return convertIntListToString(l_pair);
    }

    /**
     * This is the main method, which first uses the insert() method and then the findMaxNumber() method.
     * Each method is described above. It prints the output on the screen. Also, it calculates and prints
     * the estimated time of the basic method findMaxNumber() in milliseconds.
     * It doesn't return anything.
     * @param args Via Console.
     */
    public static void main(String[] args)
    {
        System.out.println("Please, insert only non negative integers, separated by spaces." +
                "\nThen press enter.");

        ArrayList<Integer> inputList = insert();

         /*//Display the values of the list.
        display(inputList);*/

        long startTime = System.currentTimeMillis();
        String result = findMaxNumber(inputList);
        long estimatedTime = System.currentTimeMillis() - startTime;

        System.out.println(result);
        System.out.println("\n\nExecution of findMaxNumber() method took " + estimatedTime + " milliseconds.");
    }
}