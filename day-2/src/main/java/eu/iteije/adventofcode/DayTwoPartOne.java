package eu.iteije.adventofcode;

import eu.iteije.adventofcode.core.AOCFileReader;

import java.util.List;

public class DayTwoPartOne {

    public static void main(String[] args) {
        AOCFileReader fileReader = new AOCFileReader();
        List<String> input = fileReader.getInputAsStrings("input.txt");

        int horizontal = 0, depth = 0;
        for (String inputString : input) {
            String[] data = inputString.split(" ");

            String type = data[0];
            int move = Integer.parseInt(data[1]);

            if (type.equals("forward")) horizontal += move;
            if (type.equals("up")) depth -= move;
            if (type.equals("down")) depth += move;
        }

        System.out.println(horizontal * depth);
    }

}
