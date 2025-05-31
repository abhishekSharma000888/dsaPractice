import java.util.ArrayList;

public class Arrays_02BuyAndSellStock {

    public static void main(String[] args) {

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        ArrayList<Integer> listOfPrices = new ArrayList<>();

        listOfPrices.add(7);
        listOfPrices.add(1);
        listOfPrices.add(5);
        listOfPrices.add(3);
        listOfPrices.add(6);
        listOfPrices.add(4);

        for (int i = 0; i < listOfPrices.size(); i++) {
            int price = listOfPrices.get(i);

            if (price < minPrice) {
                minPrice = price; // update the best buying price so far
            } else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
    }
}
