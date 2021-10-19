package ru.netology.stats;

public class StatsService {

    public int shouldHowMuchDidYouSell(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int shouldHowManySoldOnAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        int result = sum / 12;
        return result;
    }

    public int shouldMonthWithMaximalSales(long[] sales) {
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

    public int shouldMonthWithMinimalSales(long[] sales) {
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

    public int shouldBelowAverageSales(int[] sales) {
        return shouldHowMuchDidYouSell(sales) / sales.length;
        int monthAVG = 0;
        for (int sale : sales){
            if(sale <= i){
                monthAVG++;

        }
            return monthAVG;

        }





 }








}
















