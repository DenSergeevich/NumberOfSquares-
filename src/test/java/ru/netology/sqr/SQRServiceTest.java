package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
   public void rangeСheck(){
        SQRService service = new SQRService();
        int actual = service.numbersInTheRange(200,300);
        int expected = 3;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void rangeBoundaryCheck(){
        SQRService service = new SQRService();
        int actual = service.numbersInTheRange(100,9_801);
        int expected = 90;
        Assertions.assertEquals(expected,actual);
    }


}
