package practice11;

public class VowelsAndConsonents {

    public static void main(String[] args) {

        String input = "Automation is transforming industries";

        input = input.toLowerCase();

        int VowelCount = 0;
        int ConsonentsCount = 0;

        for(char ch: input.toCharArray()) {


            if (ch != ' ') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                    VowelCount++;
                } else {

                    ConsonentsCount++;
                }
            }
        }

        System.out.println("VowelCount is: "+ VowelCount);
        System.out.println("ConsonentCount is:"+ ConsonentsCount);
    }
}
