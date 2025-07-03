package practice12;

public class ReplaceTheWrod {

    public static void main(String[] args) {

        String input = "Ravi Teja Bompally";

        String[] words = input.split(" ");

        StringBuilder sb = new StringBuilder();

            StringBuilder firstWord = new StringBuilder(words[0].substring(0,1).toUpperCase());
            firstWord.append(".");
            StringBuilder secondWord = new StringBuilder(words[1].substring(0,1).toUpperCase());
            secondWord.append(".");

            StringBuilder thirdWord = new StringBuilder(words[2]);

            StringBuilder finalWord = new StringBuilder();

            finalWord.append(firstWord);
            finalWord.append(secondWord);
            finalWord.append(thirdWord);

            System.out.println(finalWord);


    }
}
