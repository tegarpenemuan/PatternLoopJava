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
public class Pattern20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        
        System.out.println("## Printing the pattern ##");
        
        for (int i=rows; i>=1; i--)
        {
            // Print star in decreasing order
            for (int j=1; j <=(i * 2) -1; j++)
            {
                if( j == 1 || j == (i * 2) -1 || i == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            // Print space in increasing order
            for (int k = rows; k >= i; k--)
            {
                System.out.print(" ");
            }
            
        }
        scanner.close();
    }
    
}
