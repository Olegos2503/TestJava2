package ru.netology.sqr;

public class SQRService {


    public int calc(int max, int min) {
        int titlle = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {

                    titlle++;
                }
            }

        }
        return titlle;
    }
}









