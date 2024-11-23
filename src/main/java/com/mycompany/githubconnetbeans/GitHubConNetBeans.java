/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.githubconnetbeans;

import java.util.Scanner;
/**
 *
 * @author Warrior HP
 */
public class GitHubConNetBeans {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        float peso;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu peso en kg: ");
        peso = scanner.nextFloat();
        if(peso > 90.0){
            System.out.println("OYE GENDA, ECUCHATE ETO TU TU TU TUTU BABABA BABA ");
        }
        else{
            System.out.println("Normal xd");
        }
    }
}
