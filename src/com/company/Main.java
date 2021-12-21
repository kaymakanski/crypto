package com.company;

public class Main {

    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();
        VigenereCipher cipher = new VigenereCipher();
        OneTimePad oneTimePad = new OneTimePad();
        String text1 = "Machine learning (ML) is the study of computer algorithms, that can improve automatically through experience and by the use of data.";

        //************************************************************************

        //Vigenere cipher
       /* String cipherText2 = cipher.encrypt(text1, "asdq123fas");
        System.out.println(cipherText2);
        System.out.println(cipher.decrypt(cipherText2, "asdq123fas"));*/

        //************************************************************************

        //OneTimePad
        int[] key = randomGenerator.generate(text1.length());
        String encryptedText = oneTimePad.encrypt(text1, key);
        System.out.println(encryptedText);
        System.out.println(oneTimePad.decrypt(encryptedText, key));

    }
}
