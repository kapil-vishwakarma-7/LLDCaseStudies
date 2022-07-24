package dsa.dp.buysellstock;

public class BuyAndSellStockI {
    public int maxProfit(int[] A) {
        int min = A[0], max = 0;

        for(int i=0; i < A.length; i++){
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i] - min);
        }

        return max;
    }
}
