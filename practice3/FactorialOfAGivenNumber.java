package practice3;

public class FactorialOfAGivenNumber {

    public static void main(String[] args) {

        int n = 11;

        int sum =1;

        for(int i=1; i<=n; i++){

            sum = sum*i;
        }

        System.out.println(sum);
    }
}
