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
public class Pattern17 {

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
        
        for (int i=1; i<=rows; i++)
        {
            // Print star in decreasing order
            for (int j=rows; j >=i; j--)
            {
                if( i == 1 || j == i || j == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            // Print space in increasing order
            for (int k=1; k<i; k++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        scanner.close();
    }
    
}
