package ru.netology;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;


public class CashBackHuckServiceTest {

    @Test
    public void remainMinTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 1;
        int actual = cashbackHackService.remain(999);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remainMaxTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 999;
        int actual = cashbackHackService.remain(1);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remainMiddleTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 500;
        int actual = cashbackHackService.remain(500);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remainNegativeOneTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void remainNegativeTwoTest() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 1000;
        int actual = cashbackHackService.remain(0);
        Assert.assertEquals(actual, expected);
    }

}