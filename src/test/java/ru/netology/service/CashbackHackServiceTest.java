package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    @Test
    public void shouldReturn100IfAmountIs() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmountIs() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;


        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}