package ru.netology.sqr;

public class SQRService {

    public int numbersInTheRange (int minValue, int maxValue) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minValue) {
                if (i * i <= maxValue) {
                    amount++;
                }
            }
        }
        return amount;
    }
}
