import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays_13RemoveN {

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();

        Collections.addAll(l1,2,2,3,4,2,6,8);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be removed:");

        int n = sc.nextInt();

        for (int i = l1.size() - 1; i >= 0; i--) {  // Loop in reverse
            if (l1.get(i) == n) {
                l1.remove(i);
            }
        }

        System.out.println("The new length of the array is:" + l1.size());

    }
}