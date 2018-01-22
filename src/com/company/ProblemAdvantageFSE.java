package com.company;

import java.util.*;

/**
 * <h1>Problem - Advantage FSE Academy</h1>
 * The ProblemAdvantageFSE program implements an application that
 * given an ArrayList of non negative integers, finds their largest
 * possible combined number and prints the output as a string on the screen.
 * <p>
 * @author Kosmidou Maria
 * @version 1.0
 * @since 2018-01-19
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
     * This method is used to get an ArrayList with integers and convert it to a string.
     * @param intList ArrayList A list with non negative integers.
     * @return String This returns a string with the same content of the above list.
     */
    private static String convertIntListToString(ArrayList<Integer> intList)
    {
        StringBuilder sb = new StringBuilder();

        for (Integer element : intList)
            sb.append(Integer.toString(element));

        return sb.toString();
    }

    /**
     * This method is used to implement the basic function of this project.
     * It gets an ArrayList with non negative integers and finds their largest possible combined number.
     * The main idea is to sort the ArrayList according to user defined criteria.
     * First, it makes use of the sort() method, implemented by the MyComparator class.
     * Then the convertIntListToString() method is called, so as to convert the sorted list to a string
     * @param integerList ArrayList A list with non negative integers.
     * @return String This returns a string,  which represents the maximum possible combined number, as a string.
     *         This is the result of the convertIntListToString() method.
     */
    public static String findMaxNumber(ArrayList<Integer> integerList)
    {
        // Sort integerList with my implementation of MyComparator class.
        integerList.sort(new MyComparator());

        /* //Display the values of sorted integerList.
        System.out.print("---> ");
        display(integerList);
        */

        return convertIntListToString(integerList);
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