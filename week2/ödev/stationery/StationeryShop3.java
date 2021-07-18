package com.week2.ödev.stationery;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class StationeryShop3 {

    public static void main(String[] args) {

        // get a scanner instance from Scanner class so as to taking input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select your material \n"
                + "1 - Pencil\n"
                + "2 - Eraser\n"
                + "3 - Notebook\n"
                + "4 - Book\n"
                + "5 - Pencil Case\n"
                + "6 - Sharpener\n"
                + "7 - Post-it\n"
                + "0 - Press Zero to End Process");

        // keep material in a list
        HashMap<Integer,String> yourBasket = new HashMap<>();
        int key = 0;
        int pencil = 0, eraser = 0, notebook = 0, book = 0, pencilCase = 0, sharpener = 0, postIt = 0;

        boolean condition = true;

        // If the condition is true, we continue to receive input from the user with this loop.

        while(condition) {

            int selectingMaterial = scanner.nextInt();

            if (selectingMaterial == 1) {
                yourBasket.put(key++, "Pencil");
                pencil++;
            } else if (selectingMaterial == 2) {
                yourBasket.put(key++, "Eraser");
                eraser++;
            } else if (selectingMaterial == 3) {
                yourBasket.put(key++, "Notebook");
                notebook++;
            } else if (selectingMaterial == 4) {
                yourBasket.put(key++, "Book");
                book++;
            } else if (selectingMaterial == 5) {
                yourBasket.put(key++, "Pencil Case");
                pencilCase++;
            } else if (selectingMaterial == 6) {
                yourBasket.put(key++, "Sharpener");
                sharpener++;
            } else if (selectingMaterial == 7) {
                yourBasket.put(key++, "Post-It");
                postIt++;
            } else if (selectingMaterial == 0) {
                System.out.println("Process is over!");
                condition = false;
                break;
            }
        }
            scanner.close();


        Iterator iterator = yourBasket.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)iterator.next();
            String marks = ((String)mapElement.getValue());
            System.out.println(mapElement.getKey() + " : " + marks);
        }

        // shows What you bought
        /*
        for(Map.Entry mapElement : yourBasket.entrySet()){
            int key = (int) mapElement.getKey();
            String value = (String) mapElement.getValue();
            System.out.println(key + " : " + value);
        }*/
        /*
        for (Map.Entry<Integer, String> entry : yourBasket.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }*/

            System.out.println("\n");
            System.out.println("Total material : " + yourBasket.size());
            System.out.println("Number of Pencil  : " + pencil);
            System.out.println("Number of Eraser : " + eraser);
            System.out.println("Number of Notebook : " + notebook);
            System.out.println("Number of Book  : " + book);
            System.out.println("Number of Pencil Case : " + pencilCase);
            System.out.println("Number of Sharpener : " + sharpener);
            System.out.println("Number of Post-it : " + postIt);

        }

}

