package practice8;

import java.util.HashMap;

public class CombinationOfTwoString {
    public static void main(String[] args) {

        String str1 = "ABCCD";
        String str2 = "BAD";

        StringBuilder sb = new StringBuilder();

        sb.append(str1);
        sb.append(str2);

        System.out.println(sb);
        HashMap<Character, Integer> h1 = new HashMap<>();

        for(char ch: sb.toString().toCharArray()){

            h1.put(ch, h1.getOrDefault(ch,0) +1);
        }

    h1.forEach((key, value) ->{

        System.out.print(key + ":"+ value + ",");
    });
    }


}
