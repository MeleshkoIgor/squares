package ru.netology.sqr;

public class SQRService {
    public int enumeration(int min, int max) {
        int num;
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            num = i * i;
            if (num >= min && num <= max) {
                count++;
            }
        }
        return count;
    }
}
