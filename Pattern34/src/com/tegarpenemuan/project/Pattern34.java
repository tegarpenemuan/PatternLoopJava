/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tegarpenemuan.project;

import java.util.Scanner;

/**
 *
 * @author tegar
 */
public class Pattern34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to in the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");

        // Print i number of stars
        for (int i = 1; i <= rows * 2 - 1; i++)
        {
            if (i == 1 || i == rows || i == rows * 2 - 1)
            {
                for (int j = 1; j <= rows; j++)
                {
                    if (j == 1 || j == rows)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            else
            {
                for (int k = 1; k <= rows; k++)
                {
                    if (k == 1 || k == rows)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
    
}
