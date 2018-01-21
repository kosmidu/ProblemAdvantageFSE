package com.company;

import java.util.*;

public class Main
{
    private static void findMaxNumber(ArrayList<Integer> integerList)
    {
        // Sort integerList with my implementation of Comparator<Integer>.
        integerList.sort(new myComparator());

        // Display the values of sorted integerList.
        System.out.print("---> ");
        for (Integer value : integerList)
            System.out.print(value + " ");

        // Convert to string
        StringBuilder sb = new StringBuilder();
        ListIterator<Integer> i = integerList.listIterator();
        while(i.hasNext())
        {
            sb.append(Integer.toString(i.next()));
        }

        String string = sb.toString();
        System.out.println("\n" + string);
    }

    public static void main(String[] args)
    {
        System.out.println("Please, insert only non negative integers, separated by spaces." +
                "\nThen press enter.");

        ArrayList<Integer> inputList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s");

        // Insert the integers to inputList.
        for (String token : tokens)
        {
            try {
                inputList.add(Integer.parseInt(token));
            }catch(NumberFormatException ex) {
                System.err.println("Please, insert only integers.");
                System.exit(-1);
            }
        }

        // Display the values of inputList.
        for (Integer value : inputList)
            System.out.print(value + " ");

        // Call the method 'findMaxNumber()'.
        findMaxNumber(inputList);
    }
}