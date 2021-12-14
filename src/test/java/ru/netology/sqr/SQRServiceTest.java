package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void shouldSqrNumber() {
        SQRService service = new SQRService();


        int min = 200;
        int max = 300;
        int expected = 3;


        int actual = service.enumeration(min, max);


        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrNotNumber() {
        SQRService service = new SQRService();
        int min = 100;
        int max = 300;
        int expected = 8;

        int actual = service.enumeration(min, max);

        assertEquals(expected, actual);

    }
}