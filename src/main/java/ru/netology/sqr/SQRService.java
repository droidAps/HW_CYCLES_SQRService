package ru.netology.sqr;

public class SQRService {
    public int squaresInTheRange(int lowerLimit, int upperLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= lowerLimit && sqr <= upperLimit) {
                counter = counter+1;
            }
        }
        return counter;
    }
}
