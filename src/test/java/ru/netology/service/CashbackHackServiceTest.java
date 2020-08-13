package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    private CashbackHackService cashback = new CashbackHackService();

    @Test
    public void shouldBuyIfLess1000(){
        int actual = cashback.remain(800);
        int expected = 200;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyIfMore1000(){
        int actual = cashback.remain(1200);
        int expected = 800;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyIf0(){
        int actual = cashback.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyIf1000(){
        int actual = cashback.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
