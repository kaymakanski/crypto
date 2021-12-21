package com.company;

public class OneTimePad {

    public String encrypt(String plainText, int[] key){

        String cipherText = "";

        for(int i = 0; i < plainText.length(); i++){
            int keyIndex = key[i];
            int charIndex = Constants.alphabet.indexOf(plainText.charAt(i));

            cipherText += Constants.alphabet.charAt(Math.floorMod(charIndex+keyIndex, Constants.alphabet.length()));
        }
        return cipherText;
    }

    public String decrypt(String cipherText, int[] key){

        String plainText = "";

        for(int i = 0; i < cipherText.length(); i++){
            int keyIndex = key[i];
            int charIndex = Constants.alphabet.indexOf(cipherText.charAt(i));

            plainText += Constants.alphabet.charAt(Math.floorMod(charIndex - keyIndex, Constants.alphabet.length()));
        }
        return plainText;
    }
}
