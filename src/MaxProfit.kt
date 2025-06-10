class MaxProfit {
    fun maxProfit(prices: List<Int>): Int {
        if(prices.isEmpty()) return 0

        var minPrice = prices[0]
        var maxProfit =0

        for(price in prices){
            if(price< minPrice){
                minPrice = price
            }else {
                var profit = price - minPrice
                if(profit > maxProfit) {
                    maxProfit = profit
                }
            }
        }
        return maxProfit
    }
}