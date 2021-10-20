package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldHowMuchDidYouSell() {
        StatsService service = new StatsService();

        long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = service.HowMuchDidYouSell(managerSales);
        assertEquals(expected, actual);

    }


    @Test
    void shouldHowManySoldOnAverage() {
        StatsService service = new StatsService();

        long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        long actual = service.HowManySoldOnAverage(managerSales);
        assertEquals(expected, actual);

    }


    @Test
    void shouldMonthWithMaximalSales() {
        StatsService service = new StatsService();

        long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        long actual = service.MonthWithMaximalSales(managerSales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldMonthWithMinimalSales() {
        StatsService service = new StatsService();

        long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        long actual = service.MonthWithMinimalSales(managerSales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldBelowAverageSales() {
        StatsService service = new StatsService();

        long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        long actual = service.BelowAverageSales(managerSales);
        assertEquals(expected, actual);
    }


    @Test
    void shouldAboveAverageSales() {
        StatsService service = new StatsService();

        long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        long actual = service.AboveAverageSales(managerSales);
        assertEquals(expected, actual);

    }


}






