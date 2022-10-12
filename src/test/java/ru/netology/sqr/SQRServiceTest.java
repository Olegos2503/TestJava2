package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void enumeration() {
        SQRService service = new SQRService();
        int actual = service.calc(400, 200);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }




    @Test
    public void test2() {
        SQRService service = new SQRService();
        int actual = service.calc(1000, 200);
        int expected = 17;

        Assertions.assertEquals(expected, actual);
    }
}
