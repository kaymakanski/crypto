package com.company;

import java.util.Random;

public class RandomGenerator {
    private Random random = new Random();

    public int[] generate(int n) {
        int[] randomSequence = new int[n];

        for (int i = 0; i < n; i++){
            randomSequence[i] = random.nextInt(Constants.alphabet.length());
        }
        return randomSequence;
    }
}
