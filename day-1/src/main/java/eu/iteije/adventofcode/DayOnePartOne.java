package eu.iteije.adventofcode;

import eu.iteije.adventofcode.core.AOCFileReader;

import java.util.List;

public class DayOnePartOne {

    public static void main(String[] args) {
        AOCFileReader fileReader = new AOCFileReader();
        List<Integer> inputList = fileReader.getInputAsIntegers("input.txt");

        int totalIncreases = 0;
        int previousNumber = -1;

        for (Integer input : inputList) {
            if (previousNumber == -1) {
                previousNumber = input;
                continue;
            }

            if (input > previousNumber) {
                totalIncreases++;
            }

            previousNumber = input;
        }

        System.out.println(totalIncreases);
    }

}
