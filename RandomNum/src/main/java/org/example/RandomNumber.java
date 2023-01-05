package org.example;

public class RandomNumber {

    private int random;

    public int random() {
        int random = (int)(Math.random() * 50 +1);
        return random;
    }

    public int getRandom() {
        return random;
    }





}
