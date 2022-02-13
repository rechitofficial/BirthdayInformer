package com.rechit.birthdayinformer.basic.wishes;

public class ListOfWishes {
    // this is part of my array learning using java :)
    public static void showListOfWishes(){
        String[] arrWishes = {"grateful", "peaceful", "thinkful"};
        String[] arrRow = {"Enlighment", "Love", "Neutrality", "Anger", "Grief", "Shame"};
        String[] arrColumn = {"1000", "500", "250", "150", "75", "20"};
        String[][] arrHertzFibrationScale = {arrRow, arrColumn};
        System.out.println("I wish I could be more: ");
        for (int x=0; x<arrWishes.length; x++){
            System.out.print(x + 1 + ". ");
            System.out.println(arrWishes[x]);
        }
        System.out.println("Choose Your Heart Vibration Scales!");
        for (int x=0; x<arrHertzFibrationScale.length; x++){
            for (int y=0; y<arrHertzFibrationScale[x].length; y++){
                System.out.print(arrHertzFibrationScale[x][y] + " ");
            }
            System.out.println("");
        }
        System.out.println("Chosen Heart Vibration Scales => " + arrHertzFibrationScale[0][1] + "(" + arrHertzFibrationScale[1][1] + ")");
    }
}
