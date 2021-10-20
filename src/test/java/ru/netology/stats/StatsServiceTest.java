package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldHowMuchDidYouSell() {
        StatsService service = new StatsService();

        long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = service.howMuchDidYouSell(managerSales);
        assertEquals(expected, actual);

    }


    @Test
    void shouldHowManySoldOnAverage() {
        StatsService service = new StatsService();

        long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        long actual = service.howManySoldOnAverage(managerSales);
        assertEquals(expected, actual);

    }


    @Test
    void shouldMonthWithMaximalSales() {
        StatsService service = new StatsService();

        long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        long actual = service.monthWithMaximalSales(managerSales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldMonthWithMinimalSales() {
        StatsService service = new StatsService();

        long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        long actual = service.monthWithMinimalSales(managerSales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldBelowAverageSales() {
        StatsService service = new StatsService();

        long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        long actual = service.belowAverageSales(managerSales);
        assertEquals(expected, actual);
    }


    @Test
    void shouldAboveAverageSales() {
        StatsService service = new StatsService();

        long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        long actual = service.aboveAverageSales(managerSales);
        assertEquals(expected, actual);

    }


}






