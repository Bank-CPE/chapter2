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
public class ShowEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("size : "+size);
        for(int i=1;i<=size;i++){
            if(i%2 == 0){
                System.out.println("number : " +i);
            }
        }
    }
}
