package practice11;

public class AnagramExample {

    public static void main(String[] args) {

        String str1 = "listen";

        String str2 = "silent";

        StringBuilder sb1 = new StringBuilder(str1).reverse();
        StringBuilder sb2 = new StringBuilder(str2).reverse();


        if(sb1.length() == sb2.length()){

            System.out.println("The strings are anagram");
        } else{

            System.out.println("The strings are not anagrams");
        }
    }
}
