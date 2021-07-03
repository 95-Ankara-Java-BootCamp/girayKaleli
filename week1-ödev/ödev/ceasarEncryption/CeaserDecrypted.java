package com.week1.ödev.ceasarEncryption;

import java.util.Scanner;

public class CeaserDecrypted {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your message : ");
        String text = scanner.nextLine();

        System.out.print("Please enter your cipher shift : ");
        int shift = scanner.nextInt();
        shift = 26 - shift;


        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < text.length(); i++){

            if(Character.isUpperCase(text.charAt(i))){

                char chip = (char)(((int)text.charAt(i) + (shift - 65)) % 26 + 65) ;

                buffer.append(chip);

            } else {

                char chip = (char)(((int)text.charAt(i) + (shift - 97)) % 26 + 97);

                buffer.append(chip);

            }

        }
        scanner.close();

        System.out.println("Text  : " + text);
        System.out.println("Decrypted Shift : " + shift);
        System.out.println("Decrypted Text: " + buffer);

    }

}
