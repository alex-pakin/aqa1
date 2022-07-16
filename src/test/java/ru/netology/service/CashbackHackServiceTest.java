package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @Test
    public void shouldCalculateAmountLessThanBoundary() {

        int actual = service.remain(666);
        int expected = 334;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldCalculateIfAmountEqualsBoundary() {

        int actual = service.remain(2000);
        int expected = 0;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldCalculateIfAmountMoreThanBoundary() {

        int actual = service.remain(2500);
        int expected = 500;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldCalculateIfAmountEqualsNull() {

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual,expected);
    }

}