package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldHowMuchDidYouSell() {
        StatsService service = new StatsService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.shouldHowMuchDidYouSell(managerSales);
        assertEquals(expected, actual);

    }


    @Test
    void shouldHowManySoldOnAverage() {
        StatsService service = new StatsService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.shouldHowManySoldOnAverage(managerSales);
        assertEquals(expected, actual);

    }


    @Test
    void shouldMonthWithMinimalSales(){
        StatsService service = new StatsService();

        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.shouldMonthWithMinimalSales(managerSales);
        assertEquals(expected, actual);

    }

}





