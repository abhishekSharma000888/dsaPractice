package practice14;

public class AllPossibleSubstring {

    public static void main(String[] args) {

        String input = "abc";

        int n = input.length();

        for(int i=0; i<n; i++){

            for(int j=i+1; j<=n; j++){

                System.out.println(input.substring(i,j));
            }
        }
    }
}
