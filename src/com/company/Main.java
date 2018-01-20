package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Please, enter only non negative integers, separated by spaces.");

        ArrayList<Integer> inputList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s");

        // Insert the integers to inputList.
        for (String token : tokens)
            inputList.add(Integer.parseInt(token));

        // Display the values of inputList.
        for (Integer value : inputList)
            System.out.print(value + " ");
    }
}