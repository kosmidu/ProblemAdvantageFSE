package com.company;

import java.util.*;

public class Main
{
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

    private static void display(ArrayList<Integer> list)
    {
        for (Integer value : list)
            System.out.print(value + " ");
    }

    private static void convertIntListToString(ArrayList<Integer> intList)
    {
        StringBuilder sb = new StringBuilder();

        for (Integer element : intList)
            sb.append(Integer.toString(element));

        String string = sb.toString();
        System.out.println("\n" + string);
    }

    private static void findMaxNumber(ArrayList<Integer> integerList)
    {
        // Sort integerList with my implementation of Comparator<Integer>.
        integerList.sort(new myComparator());

        // Display the values of sorted integerList.
        System.out.print("---> ");
        display(integerList);

        // Convert the list to string and print it.
        convertIntListToString(integerList);
    }

    public static void main(String[] args)
    {
        System.out.println("Please, insert only non negative integers, separated by spaces." +
                "\nThen press enter.");

        // Get the input from console. Insert the integers to inputList.
        ArrayList<Integer> inputList = insert();

        // Display the values of the list.
        display(inputList);

        // Find the maximum possible combined number.
        findMaxNumber(inputList);
    }
}