package com.company;

import java.util.Scanner;

public class AbilityModFinder {

    private Scanner statValue = new Scanner(System.in);
    private int abilNum;
    private int modScore;
    private int i;

    public void statFinder() {
        System.out.println("Enter your ability score");
        abilNum = statValue.nextInt();
        modScore = abilNum / 2;

        if(modScore==0){
            System.out.println("Your modifier is -5");
        }else if (modScore==1){
            System.out.println("Your modifier is -4");
        }else if (modScore==2) {
            System.out.println("Your modifier is -3");
        }else if (modScore==3) {
            System.out.println("Your modifier is -2");
        }else if (modScore==4) {
            System.out.println("Your modifier is -1");
        }else if (modScore==5) {
            System.out.println("Your modifier is 0");
        }else if(modScore==6){
            System.out.println("Your modifier is 1");
        }else if (modScore==7){
            System.out.println("Your modifier is 2");
        }else if (modScore==8) {
            System.out.println("Your modifier is 3");
        }else if (modScore==9) {
            System.out.println("Your modifier is 4");
        }else if (modScore==10) {
            System.out.println("Your modifier is 5");
        }



        //System.out.println(modScore);

       //System.out.println("Your ability is: " + modScore);

    }
}
