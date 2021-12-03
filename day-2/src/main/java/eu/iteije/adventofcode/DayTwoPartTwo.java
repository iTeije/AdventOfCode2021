package eu.iteije.adventofcode;

import eu.iteije.adventofcode.core.AOCFileReader;

import java.util.List;

public class DayTwoPartTwo {

    public static void main(String[] args) {
        AOCFileReader fileReader = new AOCFileReader();
        List<String> input = fileReader.getInputAsStrings("input.txt");

        int horizontal = 0, depth = 0, aim = 0;
        for (String inputString : input) {
            String[] data = inputString.split(" ");

            String type = data[0];
            int move = Integer.parseInt(data[1]);

            if (type.equals("forward")) {
                horizontal += move;
                depth += aim * move;
            }
            if (type.equals("up")) aim -= move;
            if (type.equals("down")) aim += move;
        }

        System.out.println(horizontal * depth);
    }

}
