package com.anna.task1.commandLine;

import java.util.ArrayList;
import java.util.Scanner;

public class OperationWithNumbers {
    static Scanner scan = new Scanner(System.in);
    
    public static void summNumbers1(){
        System.out.println("Add integer characters due space. For end numbers enter write word end");
        int summ = 0;
        int number;
        
        while(scan.hasNextInt()==true){
            number = scan.nextInt();
            summ+=number;
        }
        System.out.print(summ);     
    }
    
    public static void summNumbers2(){
        System.out.println("Add integer characters due space. For end numbers enter write word end");
        int summ = 0;
        String number;
        while(true){
            int num;
            number = scan.next();
            try{
            num = Integer.parseInt(number);
            summ+=num;
            }catch(Exception e){
                break;
            }
        }
        
        System.out.println(summ); 
    }
    
    
        
    public static void evenOddNumbers(){
        int number;
        System.out.println("Enter please intager numbers. For end enter write END:");
        while(scan.hasNextInt()){
            number = scan.nextInt();
            if(number%2==0){
                System.out.println("Even number: "+number);
            }else{
                System.out.println("Odd number: "+ number);
            } 
        }
    }
    
    public static void minMaxNumber(){
        System.out.println("Enter please intager numbers. For end enter write END:");
        ArrayList<Integer> list = new ArrayList<Integer>();
        int number;
        int max =  0;
        int min =  0;
        
        try{
            while(scan.hasNextInt()){
                number = scan.nextInt();
                list.add(number);
            }

            for(int i = 0; i < list.size(); i++){
                if(list.get(i) > max) {
                    max = list.get(i);
                }             
            }
            System.out.println("Max: " + max);
            
            for(int i = 0; i < list.size(); i++){
                if(list.get(i) < min) {
                    min = list.get(i);
                }             
            }
            System.out.println("Min: " + min);


        }catch(Exception ex){
            System.err.println(ex);
        }
        
        
    }

    public static void threeOrNine(){
        int number;
        System.out.println("Enter please intager numbers. For end enter write END:");
        while(scan.hasNextInt()){
            number = scan.nextInt();
            if((number%3==0)||(number%9==0)){
                System.out.println("Number divisible by 3 OR 9: "+number);
            }
        }
    }
    
    public static void fiveAndSeven(){
        int number;
        System.out.println("Enter please intager numbers. For end enter write END:");
        while(scan.hasNextInt()){
            number = scan.nextInt();
            if((number%5==0)&&(number%7==0)){
                System.out.println("Number divisible by 5 AND 7: "+number);
            }
        }
    }
    
    public static void threeNotSameChar(){
        String number;
        System.out.println("Enter please three-digit numbers: ");
        number = scan.next();
        if((number.charAt(0) != number.charAt(1))&&
               (number.charAt(0) !=number.charAt(2))&&
                (number.charAt(0) !=number.charAt(2))){
            System.out.println("Number hasn't same symbols: "+number);
        }
    }
    
    public static void halfSummNeib(){
        System.out.println("Enter please intager numbers. For end enter write END:");
        ArrayList<Integer> list = new ArrayList<Integer>();
        int number;
      
        while(scan.hasNextInt()){
            number = scan.nextInt();
            list.add(number);
        }
        
        for (int i = 0; i < list.size()-2; i++){
            int halfSumm = (list.get(i) + list.get(i+2))/2;
            if(halfSumm == list.get(i+1)){
                System.out.println("Numbers equals half of neib. summ: " + list.get(i+1));
            }
        }

        
    }
    
}

