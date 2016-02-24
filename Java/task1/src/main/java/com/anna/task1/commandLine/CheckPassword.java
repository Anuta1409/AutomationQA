package com.anna.task1.commandLine;

import java.util.Scanner;
/*
hello user
add password and compare it with neccessary
*/
public class CheckPassword {

    public static void checkPassword(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter your name: ");
        String name = scan.next();
        String expectedPassword = "anna12345";
        System.out.println("Please, enter your password: ");
        String actualPassword = scan.next();
        
        if(expectedPassword.equals(actualPassword)){
            System.out.println("Hello "+ name+"!!!");
        }else{
            System.out.println("You enter not valid password!!!Please, try again...");
            checkPassword();
        }
    }
    
}
