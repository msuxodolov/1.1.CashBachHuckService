package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.service.CashbackHackService;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remainMinTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 1;
        int actual = cashbackHackService.remain(999);
        assertEquals(expected, actual);
    }

    @Test
    void remainMaxTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 999;
        int actual = cashbackHackService.remain(1);
        assertEquals(expected, actual);
    }

    @Test
    void remainMiddleTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 500;
        int actual = cashbackHackService.remain(500);
        assertEquals(expected, actual);
    }

    @Test
    void remainNegativeTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 1000;
        int actual = cashbackHackService.remain(0);
        assertEquals(expected, actual);
    }

}