/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GEORGE KLICKZ
 *

    /**
     * @param args the command line arguments
     */
    /**import java.util.Arrays;
    
    public class NoticingEvenNumbers{
    public static void main(String[] args) {
        // giving notification to even numbers
        int[] Narray = {1,19,2,3,4,5,6,6,7,8,9,10,11,12,13,14,20,15,16,17,18};
        //NArray =new int{1,2,3,4,5,6,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        
        for (int i : Narray)
        {
            Arrays.sort(Narray);
            printNarray("your array", Narray);
        }
        }
            
    }*/
package assignment2_10525158;

public class NoticingEvenNumbers 
{
    public static void main(String[] args)
    {
        for(int i=1;i<=20;i++)
        {
            if((i%2)==0)
            {
                System.out.printf("%d<%n",i);
            }
            else
            {
            System.out.printf("%d%n",i); 
            }
        }
    }
}



    

