package future;

import java.util.ArrayList;
import java.util.Collections;

public class BestTimeToBuyAndSellStock_121 {
    public int maxProfit(int[] prices) {

        ArrayList<Integer> pricesList = new ArrayList<Integer>();
        for(int i = 0;i<prices.length;i++){
            pricesList.add(prices[i]);
        }
        ArrayList<Integer> sortedPricesList = new ArrayList<Integer>();

        for(int i = 0;i<pricesList.size();i++){
            sortedPricesList.add(pricesList.get(i));
        }
        Collections.sort(sortedPricesList);

        int min;

        if(pricesList.size() > 1){
            if(pricesList.indexOf(sortedPricesList.get(0)) == (pricesList.size()-1)){
                min = sortedPricesList.get(1);
            }else{
                min = sortedPricesList.get(0);
            }
        }else{
            min = sortedPricesList.get(0);
        }

        int profit = 0;
        int temp = 0;

        for(int i = pricesList.indexOf(min);i<(prices.length-1);i++){
            for(int j = i+1;j<prices.length;j++){
               temp = pricesList.get(j) - pricesList.get(i);
               if(temp>profit){
                   profit = temp;
               }
            }
        }

        return profit;
    }


    public static void main(String[] args) {

        BestTimeToBuyAndSellStock_121 solutionObj = new BestTimeToBuyAndSellStock_121();

        int[] input1 = {1};

        int output = solutionObj.maxProfit(input1);

        System.out.println("Output is : "+output);

    }
}
