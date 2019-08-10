package com.academy.lesson02.Exercise1;

public class ArrayDemo {
    public static void main(String[] args) {

        int[][] arrayInt = new int[][]{
            {1,2,3},
            {4,5,6}
        };

//        for(int i=0; i<arrayInt.length;i++){
//
//            for(int j=0; j<arrayInt[i].length;j++){
//                System.out.print(arrayInt[i][j]);
//            }
//        }

//        for(int i=1; i<=arrayInt.length && i >=0;i--){
//            for(int j=2; j<arrayInt[i].length && j>=0 ;j--){
//                System.out.print(arrayInt[i][j]);
//            }
//        }


        for(int i=0; i<=arrayInt.length;i++){


            for(int j=0; j<arrayInt[i].length;j++) {
                System.out.print(arrayInt[i][j]);
                i++;
                System.out.print(arrayInt[i][j]);
                i--;j++;
                System.out.print(arrayInt[i][j]);
                i++;
                System.out.print(arrayInt[i][j]);
                i--;j++;
                System.out.print(arrayInt[i][j]);
                i++;
                System.out.print(arrayInt[i][j]);
                break;
            }
            break;
        }

        //1 option
        int counter =1;
        int row =2;
        int col = 3;
        int [][] arrayComplex = new int[row][col];

        for (int r=0;r<arrayComplex.length;r++){
            for(int c =0; c<arrayComplex[r].length;c++){
                arrayComplex[r][c]=counter;
                counter++;
            }
        }
    }

}
