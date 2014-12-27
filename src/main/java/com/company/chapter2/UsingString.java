/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.chapter2;

import java.util.Scanner;


/**
 *
 * @author BANK.CPE
 */
public class UsingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string : ");
        String topic = scanner.nextLine();
        
        System.out.println("Length : "+topic.length());
        
        System.out.println();
        String[] str = topic.split("-", 3);
        for(String i : str ){
            System.out.println("String  : "+i);
        }
        
        System.out.println();
        System.out.println("Character : "+topic.replaceAll("[^a-zA-Z]",""));
        System.out.println("Integer : "+topic.replaceAll("[^0-9]",""));
                
    }
}
