package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum = sum + sale;
        }

        return sum;
    }

    public long averageSalesAmount(long[] sales) {
        long average = sumSales(sales) / 12;

        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        int countingMonth = 0;

        for (long sale : sales) {
            if (sale < averageSalesAmount(sales)) {
                countingMonth++;
            }
        }

        return countingMonth;
    }

    public int aboveAverage(long[] sales) {
        int countingMonth = 0;

        for (long sale : sales) {
            if (sale > averageSalesAmount(sales)) {
                countingMonth++;
            }
        }

        return countingMonth;
    }
}