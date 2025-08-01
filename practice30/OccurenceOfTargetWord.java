package practice30;

public class OccurenceOfTargetWord {

    public static void main(String[] args) {
        //find common elements in two arrays

        String str = "abc@#%hgyt@#%dkdhjhk@#%kdhkdhhs k@#%dhkjdhfkhfk@#%";

        String target = "@#%";

        String[] parts = str.split("@#%");

        int count = parts.length;

        System.out.println("The target occured : "+ count + " times.");



    }
}
