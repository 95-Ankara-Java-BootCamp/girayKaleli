package com.week2.ödev.stationery;

import java.util.Scanner;

public class StationeryShop2 {

    public static void main(String[] args) {

        // get a scanner instance from Scanner class so as to taking input from user
        Scanner scanner = new Scanner(System.in);

        // first we need to determine the type of materials
        System.out.println("how many materials do you want: ");
        int materialDiversity = scanner.nextInt();

        System.out.println("Please select your material \n"
                + "1 - Pencil\n"
                + "2 - Eraser\n"
                + "3 - Notebook\n"
                + "4 - Book\n"
                + "5 - Pencil Case\n"
                + "6 - Sharpener\n"
                + "7 - Post-it\n");

        // keep material in a list
        String[] material = new String[materialDiversity];
        int pencil = 0, eraser = 0, notebook = 0, book = 0, pencilCase = 0, sharpener = 0, postIt = 0;
        //HashMap<Integer,String> yourBasket = new HashMap<>();

        //boolean condition = true;

        // If the condition is true, we continue to receive input from the user with this loop.

        for (int i = 0; i <= material.length-1; i++) {

            int selectingMaterial = scanner.nextInt();

            if (selectingMaterial == 1) {
                material[i] = "Pencil";
                pencil++;
            } else if (selectingMaterial == 2) {
                material[i] = "Eraser";
                eraser++;
            } else if (selectingMaterial == 3) {
                material[i] = "Notebook";
                notebook++;
            } else if (selectingMaterial == 4) {
                material[i] = "Book";
                book++;
            } else if (selectingMaterial == 5) {
                material[i] = "Pencil Case";
                pencilCase++;
            } else if (selectingMaterial == 6) {
                material[i] = "Sharpener";
                sharpener++;
            } else if (selectingMaterial == 7) {
                material[i] = "Post-it";
                postIt++;
            } else {
                System.out.println("Process is over!");
                break;
            }
        }
            scanner.close();

            // shows What you bought
            for (String string : material) {
                System.out.print(string + " \t ");
            }
            System.out.println("\n");
            System.out.println("Total material : " + material.length);
            System.out.println();
            System.out.println("Number of Pencil  : " + pencil);
            System.out.println("Number of Eraser : " + eraser);
            System.out.println("Number of Notebook : " + notebook);
            System.out.println("Number of Book  : " + book);
            System.out.println("Number of Pencil Case : " + pencilCase);
            System.out.println("Number of Sharpener : " + sharpener);
            System.out.println("Number of Post-it : " + postIt);

        }

}
