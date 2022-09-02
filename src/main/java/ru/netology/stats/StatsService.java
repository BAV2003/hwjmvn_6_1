package ru.netology.stats;

public class StatsService {

    //1
    public int allSalesAmount(long[] sales) {
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + (int) sales[i];
        }
        return amount;
    }

    //2
    public int averageMonthSales(long[] sales) {
        int amount = 0;
        int average = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + (int) sales[i];
            average = amount / sales.length;
        }
        return average;
    }

    //3
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //4
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //5
    public int lowAveSalesMonth(long[] sales) {
        int average = averageMonthSales(sales);
        int salesLowAverage = 0;
        for (long sale : sales) {
            if (sale < average) {
                salesLowAverage = salesLowAverage + 1;
            }
        }
        return salesLowAverage;
    }

    //6
    public int upAveSalesMonth(long[] sales) {
        int average = averageMonthSales(sales);
        int salesUpAverage = 0;
        for (long sale : sales) {
            if (sale < average) {
                salesUpAverage = salesUpAverage + 1;
            }
        }
        return salesUpAverage;
    }
}
