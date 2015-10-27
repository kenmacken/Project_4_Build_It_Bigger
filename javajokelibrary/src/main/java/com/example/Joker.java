package com.example;

import java.util.Random;

public class Joker {

    public static String getJoke() {
        //return randomJoke();
        return null;
    }

    private static String randomJoke() {
        Random random = new Random();
        if(random.nextBoolean()) {
            return "This is totally a funny joke 1. haha";
        } else {
            return "This is totally a funny joke 2. haha";
        }
    }
}
