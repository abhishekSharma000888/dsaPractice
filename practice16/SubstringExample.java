package practice16;



public class SubstringExample {

    public static void main(String[] args) {

        String input = "Ravi Teja Bompally";

        String[] words = input.split(" ");
        String dot = ".";
        StringBuilder sb = new StringBuilder();

        sb.append(words[0].substring(0, 1)).append(dot)
                .append(words[1].substring(0, 1)).append(dot)
                .append(words[2]);

        System.out.println(sb);



    }

}
