package com.academy.lesson01.Task10;

public class Task10 {
    public static void main(String[] args)
    {
        String star = "*";
        for(int i=1;i<6;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
