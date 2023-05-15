package ru.netology.service;

///import org.junit.jupiter.api.Test;

///import static org.junit.jupiter.api.Assertions.*;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    @Test
    void shouldReturn100IfAmountIs() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 1;


        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}