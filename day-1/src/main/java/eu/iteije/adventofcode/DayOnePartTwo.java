package eu.iteije.adventofcode;

import eu.iteije.adventofcode.core.AOCFileReader;

import java.util.ArrayList;
import java.util.List;

public class DayOnePartTwo {

    public static void main(String[] args) {
        AOCFileReader fileReader = new AOCFileReader();
        List<Integer> inputList = fileReader.getInputAsIntegers("input.txt");

        List<Integer> sumInputList = new ArrayList<>();
        for (int i = 0; i < inputList.size() - 2; i++) {
            sumInputList.add((inputList.get(i) + inputList.get(i + 1) + inputList.get(i + 2)));
        }

        int totalIncreases = 0;
        int previousNumber = -1;

        for (Integer input : sumInputList) {
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
