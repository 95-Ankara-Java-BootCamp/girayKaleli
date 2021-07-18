/**
 *
 * @author Guray Kaleli,2021
 *
 * @return calculate transactions in the stationery shop
 *
 *
 **/

package com.week2.ödev.stationery;

import java.util.*;


public class StationeryShop {

    public static void main(String[] args) {

        // get a scanner instance from Scanner class so as to taking input from user
        Scanner scanner = new Scanner(System.in);

        // keep material in a list
        LinkedList<String> material = new LinkedList<>();
        int pencil=0, eraser=0, notebook=0, book=0, pencilCase=0, sharpener=0, postIt=0;

        System.out.println("Please select your material \n"
                            +"1 - Pencil\n"
                            +"2 - Eraser\n"
                            +"3 - Notebook\n"
                            +"4 - Book\n"
                            +"5 - Pencil Case\n"
                            +"6 - Sharpener\n"
                            +"7 - Post-it\n"
                            +"0 - Press Zero to End Process");

        boolean condition = true;

        while (condition){

            int selectingMaterial = scanner.nextInt();

            switch (selectingMaterial){
                case 1 :
                    material.add("Pencil");
                    pencil++;
                    break;
                case 2 :
                    material.add("Eraser");
                    eraser++;
                    break;
                case 3 :
                    material.add("Notebook");
                    notebook++;
                    break;
                case 4 :
                    material.add("Book");
                    book++;
                    break;
                case 5 :
                    material.add("Pencil Case");
                    pencilCase++;
                    break;
                case 6 :
                    material.add("Sharpener");
                    sharpener++;
                    break;
                case 7 :
                    material.add("Post-It");
                    postIt++;
                    break;
                case 0 :
                    System.out.println("Process is over!");
                    condition = false;
                    break;
                default:
                    System.out.println("Error.....");

            }

        }
        scanner.close();

        // shows What you bought
        for (String string : material) {
            System.out.print(string + " -- ");
        }
        System.out.println();

        System.out.println("Total material : " + material.size());
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
