# -*- encoding:utf8 -*-
"""
Say you have an array for which the ith element is the price of a given stock on day i.
Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
"""
class Solution(object):
    def __init__(self):
        pass

    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        max_profit = 0
        for i in range (1, len(prices)-1):
            if prices[i]>prices[i-1]:
                max_profit += prices[i] - prices[i-1]
        return max_profit


if __name__ == "——main__":
    sol = Solution()
    profit = sol.maxProfit([1, 7, 2, 3, 6, 7, 6, 7])
    print profit