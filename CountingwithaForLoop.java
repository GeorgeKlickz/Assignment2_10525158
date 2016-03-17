/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GEORGE KLICKZ
 */

    package assignment2_10525158;


import java.util.Scanner;
public class CountingwithaForLoop {
  
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = input.nextLine();

        for ( int n = 1 ; n <= 5 ; n = n+1 )
        {
            System.out.println( n + ". " + message );
        }

    }
}