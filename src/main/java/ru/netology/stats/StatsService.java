package ru.netology.stats;

public class StatsService {

    public long howMuchDidYouSell(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long howManySoldOnAverage(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        long result = sum / 12;
        return result;
    }

    public long monthWithMaximalSales(long[] sales) {
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

    public long monthWithMinimalSales(long[] sales) {
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

    public long belowAverageSales(long[] sales) {
        long monthAVG = howMuchDidYouSell(sales) / sales.length;
        long monthBlwAVG = 0;
        for (long sale : sales) {
            if (sale <= monthAVG) {
                monthBlwAVG++;

            }


        }
        return monthBlwAVG;

    }

    public long aboveAverageSales(long[] sales) {
        long monthAVG = howMuchDidYouSell(sales) / sales.length;
        long monthAbvAVG = 0;
        for (long sale : sales) {
            if (sale >= monthAVG) {
                monthAbvAVG++;

            }
        }
        return monthAbvAVG;
    }


}
















