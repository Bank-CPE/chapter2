/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpe4235.chapter2;

import java.util.Scanner;

/**
 *
 * @author BANK.CPE
 */
public class FindTheMaximun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Value 1 : ");
        int value1 = scanner.nextInt();
        System.out.print("Value 2 : ");
        int value2 = scanner.nextInt();
        System.out.print("Value 3 : ");
        int value3 = scanner.nextInt();
        
        int maxinum = value1;
        
        if(maxinum < value2){
            maxinum = value2;
        }
        else if (maxinum < value3){
            maxinum = value3;
        }    
        System.out.println("Maxinum value is : "+maxinum);
     
    }
}
