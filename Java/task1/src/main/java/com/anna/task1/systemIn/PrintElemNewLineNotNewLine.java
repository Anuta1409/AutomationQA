package com.anna.task1.systemIn;


public class PrintElemNewLineNotNewLine {
        
    public static void printElemNewLine(String[] args){
        int i = 0;
        try {
            while ( i <= args.length){
                System.out.println(args[i]);
                i++;
            }
        }catch(ArrayIndexOutOfBoundsException e){}
    }
    
     public static void printElemNotNewLine(String[] args){
        int i = 0;
        try {
            while ( i <= args.length){
                System.out.print(args[i]+"  ");
                i++;
            }
        }catch(ArrayIndexOutOfBoundsException e){}
    }
    
}
