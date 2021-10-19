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

    public int shouldMonthWithMinimalSales(int[] sales){
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales){
            if (sale >= sales[maxMonth]){
                maxMonth = month;
            }
            month = month + 1;

            }
        return maxMonth + 1;

        }

    }









