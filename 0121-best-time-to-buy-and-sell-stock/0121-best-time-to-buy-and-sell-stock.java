class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        //[7,1,5,3,6,4]
        // p 
        //minPrice = 1
        //maxProfit = 4

        for (int price : prices) {  //
            if (price < minPrice){   // 7< 7, 1< 7,  5<1
                minPrice = price;  //7=7,  1 = 1  ,  x
        }

        if (price - minPrice > maxProfit) {   //7-7 > 0,  1-1 > 0,  5-1 > 0
            maxProfit = price - minPrice;    // 0 = 7-7, 0= 1-1 , 0= 5-1,  continue the psame process

        }
        }

        return maxProfit;
    }
}