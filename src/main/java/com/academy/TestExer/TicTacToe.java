package com.academy.TestExer;

import java.util.Scanner;


public class TicTacToe {

    public static int number;
    public static String value;


    public static void main(String[] args) {
        PlaiyngFiled plaiyngFiled = new PlaiyngFiled();

        System.out.println("You have the next playing filed");
        plaiyngFiled.showCurrentfield();
        System.out.println("Game start from X-player!");
        enterValue();
        plaiyngFiled.reWriteMap(number,value);
        plaiyngFiled.showCurrentfield();




    }

    public static void enterValue(){
        while (!CheckEnteredValue(0));
        while (!CheckEnteredValue(1));
    }

    public static boolean CheckEnteredValue(int i) {
        Scanner scanner = new Scanner(System.in);
        Boolean point=true;
        if(i==0){
            System.out.println("Select the 'number' on the map, where you want to put your letter");
            try {
                number = Integer.parseInt(scanner.nextLine());
                if(number>=1 & number <=9){
                    return  point;
                }
                else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Invalid input! You have to choose the number from 1 to 9. Try again...");
                return  point= false;
            }
        }
        else {
            System.out.println("Write your Character");
            value = scanner.nextLine().toUpperCase();
            if(value.equals("X") | value.equals("O")){
                return point;
            }else {
                System.out.println("Invalid input! You have to choose only 'X' or 'O' letters. Try again...");
                return point=false;
            }
        }
    }




}
