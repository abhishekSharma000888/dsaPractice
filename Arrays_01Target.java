import java.util.*;

public class Arrays_01Target {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create and populate the ArrayList
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter elements of the list (type 'done' to stop):");
        while (sc.hasNextInt()) {
            nums.add(sc.nextInt());
        }
        sc.next(); // consume the "done"

        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        sc.close();

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + nums.get(result[0]) + ", " + nums.get(result[1]));
        } else {
            System.out.println("No two numbers found that add up to the target.");
        }
    }

    public static int[] twoSum(ArrayList<Integer> nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // num → index

        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums.get(i);

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums.get(i), i);
        }

        return new int[0]; // No match found
    }
}
