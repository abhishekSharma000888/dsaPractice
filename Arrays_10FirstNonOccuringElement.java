import java.util.ArrayList;
import java.util.Collections;

public class Arrays_10FirstNonOccuringElement {
    public static void main(String[] args) {

        ArrayList<Character> a = new ArrayList<>();

        Collections.addAll(a, 'a', 'b', 'a', 'c', 'd', 'b');

        for(char c : a){

            System.out.println(c);
        }

        boolean isDuplicate = false;

        for(int i=0; i< a.size(); i++){

            char element = a.get(i);

            int frequency = Collections.frequency(a,element);

            if(frequency == 1){

                System.out.println("The first non recuring element is: "+element);
                return;
            }
        }
    }
}
