package eu.iteije.adventofcode;

import eu.iteije.adventofcode.core.AOCFileReader;

import java.util.List;

public class DayThreePartOne {

    public static void main(String[] args) {
        AOCFileReader fileReader = new AOCFileReader();
        List<String> input = fileReader.getInputAsStrings("input.txt");

        StringBuilder gammaRate = new StringBuilder();
        StringBuilder epsilonRate = new StringBuilder();

        int length = input.get(0).length();

        for (int i = 0; i < length; i++) {
            int finalI = i;
            int zeroCount = (int) input.stream().filter(inputString -> inputString.charAt(finalI) == '0').count();
            if (zeroCount > (input.size() / 2)) {
                gammaRate.append("0");
                epsilonRate.append("1");
            } else {
                gammaRate.append("1");
                epsilonRate.append("0");
            }
        }

        int gammaRateDecimal = Integer.parseInt(gammaRate.toString(), 2);
        int epsilonRateDecimal = Integer.parseInt(epsilonRate.toString(), 2);

        System.out.println("Gamma rate binary: " + gammaRate + ", gamma rate decimal: " + gammaRateDecimal);
        System.out.println("Epsilon rate binary: " + epsilonRate + ", epsilon rate decimal: " + epsilonRateDecimal);

        System.out.println(gammaRateDecimal * epsilonRateDecimal);
    }

}
