package com.company;

import java.sql.Struct;

public class VigenereCipher {
    private static final String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String encrypt(String plainText, String key) {

        plainText = plainText.toUpperCase();
        key = key.toUpperCase();

        String cipherText = "";
        int keyIndex = 0;

        for(int i = 0; i < plainText.length(); i++){
            char c = plainText.charAt(i);

            int index = Math.floorMod(alphabet.indexOf(c) + alphabet.indexOf(key.charAt(keyIndex)), alphabet.length());
            cipherText += alphabet.charAt(index);

            keyIndex++;
            if(keyIndex == key.length())
                keyIndex = 0;
        }
        return cipherText;
    }

    public String decrypt(String cipherText, String key){
        cipherText = cipherText.toUpperCase();
        key = key.toUpperCase();

        String plainText = "";
        int keyIndex = 0;

        for(int i = 0; i < cipherText.length(); i++){
           char c = cipherText.charAt(i);

           int index = Math.floorMod(alphabet.indexOf(c) - alphabet.indexOf(key.charAt(keyIndex)), alphabet.length());
           plainText += alphabet.charAt(index);

           keyIndex++;
           if(keyIndex == key.length())
               keyIndex = 0;
        }
        return plainText;
    }
}
