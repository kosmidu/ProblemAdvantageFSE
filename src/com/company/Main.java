package com.company;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Please, insert only non negative integers, separated by spaces.\nThen press enter.");

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
    }
}