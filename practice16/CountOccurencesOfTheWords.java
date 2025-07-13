package practice16;

import java.util.LinkedHashMap;

public class CountOccurencesOfTheWords {

        public static void main(String[] args) {
            String[] arr1 = {"one", "two", "five", "nine", "eight"};
            String[] arr2 = {"one", "four", "five", "eight", "ten"};


            LinkedHashMap<String, Integer> h1 = new LinkedHashMap<>();

            for (String word : arr1) {

                h1.put(word, h1.getOrDefault(word, 0) + 1);
            }
            for (String word : arr2) {

                h1.put(word, h1.getOrDefault(word, 0) + 1);
            }

            h1.forEach((key, value) -> {
                if (value > 1) {

                    System.out.println(key + " " + "occured" + value);
                }
            });
        }
    }

