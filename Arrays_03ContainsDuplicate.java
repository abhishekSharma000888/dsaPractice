import java.util.ArrayList;

public class Arrays_03ContainsDuplicate {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(1);
        a.add(3);

        boolean duplicate = false;

        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i).equals(a.get(j))) {
                    duplicate = true;
                    break;
                }
            }
            if (duplicate) break;
        }

        System.out.println(duplicate);
    }
}
