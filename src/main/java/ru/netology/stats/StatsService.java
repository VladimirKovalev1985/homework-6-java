package ru.netology.stats;

public class StatsService {

    public long HowMuchDidYouSell(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long HowManySoldOnAverage(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        long result = sum / 12;
        return result;
    }

    public long MonthWithMaximalSales(long[] sales) {
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

    public long MonthWithMinimalSales(long[] sales) {
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

    public long BelowAverageSales(long[] sales) {
        long monthAVG = HowMuchDidYouSell(sales) / sales.length;
        long monthBlwAVG = 0;
        for (long sale : sales) {
            if (sale <= monthAVG) {
                monthBlwAVG++;

            }


        }
        return monthBlwAVG;

    }

    public long AboveAverageSales(long[] sales) {
        long monthAVG = HowMuchDidYouSell(sales) / sales.length;
        long monthAbvAVG = 0;
        for (long sale : sales) {
            if (sale >= monthAVG) {
                monthAbvAVG++;

            }
        }
        return monthAbvAVG;
    }


}
















