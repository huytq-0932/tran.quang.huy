package com.tr4n.random;

import java.util.Random;

public class IntRandom {

    public static int next(int max) {
        Random random = new Random();
        if(max >= 0){
            return random.nextInt(max);
        }else {
            return - random.nextInt(-max);
        }
    }
}
