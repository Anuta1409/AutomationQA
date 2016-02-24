package com.anna.task1.systemIn;

public class IntSumm {
        
    public static void intSumm(String[] args){
        int summ = 0;
        
        for(int i = 0; i < args.length; i++){
           summ += Integer.parseInt(args[i]);
        }
        
        System.out.println(summ);
        
    }
    
}
