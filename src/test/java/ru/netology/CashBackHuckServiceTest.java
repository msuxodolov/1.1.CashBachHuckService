package ru.netology;


import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;


public class CashBackHuckServiceTest {

    @Test
    public void remainMinTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 1;
        int actual = cashbackHackService.remain(999);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainMaxTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 999;
        int actual = cashbackHackService.remain(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainMiddleTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 500;
        int actual = cashbackHackService.remain(500);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainNegativeOneTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remainNegativeTwoTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 1000;
        int actual = cashbackHackService.remain(0);
        Assert.assertEquals(expected, actual);
    }

}