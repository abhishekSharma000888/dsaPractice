package practice35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CharacterAnalyzer {
    public static void main(String[] args) {
        String input = "a1b23z9k";

        Result result = analyze(input);

        System.out.println("Input: " + input);
        System.out.println("Sorted Alphabets: " + result.getAlphabets());
        System.out.println("Numbers: " + result.getNumbers());
        System.out.println("Sum of Numbers: " + result.getSum());
    }

    public static Result analyze(String input) {
        List<Character> alphabets = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;

        int i = 0;
        while (i < input.length()) {
            char ch = input.charAt(i);

            // Handle multi-digit numbers
            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    num = num * 10 + (input.charAt(i) - '0');
                    i++;
                }
                numbers.add(num);
                sum += num;
            }
            else if (Character.isLetter(ch)) {
                alphabets.add(ch);
                i++;
            }
            else {
                i++; // ignore special characters
            }
        }

        // Sort alphabets
        Collections.sort(alphabets);

        return new Result(alphabets, numbers, sum);
    }
}

// Helper class (clean design)
class Result {
    private List<Character> alphabets;
    private List<Integer> numbers;
    private int sum;

    public Result(List<Character> alphabets, List<Integer> numbers, int sum) {
        this.alphabets = alphabets;
        this.numbers = numbers;
        this.sum = sum;
    }

    public List<Character> getAlphabets() {
        return alphabets;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int getSum() {
        return sum;
    }
}
