package com.company;

import java.sql.Struct;

public class VigenereCipher {

    public String encrypt(String plainText, String key) {

        String cipherText = "";
        int keyIndex = 0;

        for(int i = 0; i < plainText.length(); i++){
            char c = plainText.charAt(i);

            int index = Math.floorMod(Constants.alphabet.indexOf(c) + Constants.alphabet.indexOf(key.charAt(keyIndex)), Constants.alphabet.length());
            cipherText += Constants.alphabet.charAt(index);

            keyIndex++;
            if(keyIndex == key.length())
                keyIndex = 0;
        }
        return cipherText;
    }

    public String decrypt(String cipherText, String key){

        String plainText = "";
        int keyIndex = 0;

        for(int i = 0; i < cipherText.length(); i++){
           char c = cipherText.charAt(i);

           int index = Math.floorMod(Constants.alphabet.indexOf(c) - Constants.alphabet.indexOf(key.charAt(keyIndex)), Constants.alphabet.length());
           plainText += Constants.alphabet.charAt(index);

           keyIndex++;
           if(keyIndex == key.length())
               keyIndex = 0;
        }
        return plainText;
    }
}
